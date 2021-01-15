package com.github.monkeywie.proxyee;

import com.github.monkeywie.proxyee.facade.LoggerFacade;
import com.github.monkeywie.proxyee.handler.HttpProxyServerHandle;
import com.github.monkeywie.proxyee.intercept.HttpProxyInterceptInitializer;
import com.github.monkeywie.proxyee.intercept.HttpProxyInterceptPipeline;
import com.github.monkeywie.proxyee.intercept.common.FullResponseIntercept;
import com.github.monkeywie.proxyee.server.HttpProxyServer;
import com.github.monkeywie.proxyee.server.HttpProxyServerConfig;
import com.github.monkeywie.proxyee.util.HttpUtil;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.Charset;

public class HtpProxyServer {
    static Logger logger = new LoggerFacade();
    public static void main(String[] args) {
        //启动一个解密https的代理服务器，并且拦截百度首页，注入js和修改响应头
//当开启了https解密时，需要安装CA证书(`src/resources/ca.crt`)至受信任的根证书颁发机构。
        HttpProxyServerConfig config =  new HttpProxyServerConfig();
        config.setHandleSsl(true);
        new HttpProxyServer().serverConfig(config);
        new HttpProxyServer().proxyInterceptInitializer(new HttpProxyInterceptInitializer() {
            @Override
            public void init(HttpProxyInterceptPipeline pipeline) {
                pipeline.addLast(new FullResponseIntercept() {

                    @Override
                    public boolean match(HttpRequest httpRequest, HttpResponse httpResponse, HttpProxyInterceptPipeline pipeline) {
                        //在匹配到百度首页时插入js
                        return HttpUtil.checkUrl(pipeline.getHttpRequest(), "^www.baidu.com$")
                                && isHtml(httpRequest, httpResponse);
                    }

                    @Override
                    public void handelResponse(HttpRequest httpRequest, FullHttpResponse httpResponse, HttpProxyInterceptPipeline pipeline) {
                        //打印原始响应信息
                        System.out.println(httpResponse.toString());
                        System.out.println(httpResponse.content().toString(Charset.defaultCharset()));
                        //修改响应头和响应体
                        httpResponse.headers().set("handel", "edit head");
            /*int index = ByteUtil.findText(httpResponse.content(), "<head>");
            ByteUtil.insertText(httpResponse.content(), index, "<script>alert(1)</script>");*/
                        httpResponse.content().writeBytes("<script>alert('hello proxyee')</script>".getBytes());
                    }
                });
            }
        });
        new HttpProxyServer().start(9999);
    }
}
