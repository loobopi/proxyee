package com.github.monkeywie.proxyee.wrapper;

import com.github.monkeywie.proxyee.model.FilterEntity;
import io.netty.handler.codec.http.HttpRequest;

/**
 * 过滤器包装类
 */
public class FilterWrapper {

    FilterEntity filterEntity = null;

    public FilterWrapper(String uri, String uriContains, String host, String port) {
        this.filterEntity = new FilterEntity(uri,uriContains,host,port);
    }

    /**
     * 是否过滤
     */
    public boolean isFilter(HttpRequest request){
        if(isUriFilter(request.getUri())){
            return true;
        }
        return false;
    }

    /**
     * 是否符合uri过滤规则
     * @return
     */
    private boolean isUriFilter(String uri){
        if(filterEntity.getUri()==null || uri.contains(filterEntity.getUri())){
            return true;
        }
        return false;
    }

    /**
     * 判断host是否符合过滤规则；
     * @param host
     * @return
     */
    private boolean isHostFilter(String host){
        if(filterEntity.getHost()==null || filterEntity.getHost().equals(host)){
            return true;
        }
        return false;
    }
    private boolean isPortFilter(String port){
        if(filterEntity.getPort()==null || filterEntity.getPort().equals(port)){
            return true;
        }
        return false;
    }

}
