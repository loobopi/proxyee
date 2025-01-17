package com.github.monkeywie.proxyee.facade;

import com.github.monkeywie.proxyee.wrapper.FilterWrapper;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

public class LoggerFacade implements Logger {

    private Logger logger = LoggerFactory.getLogger(LoggerFactory.class);

    @Override
    public String getName() {
        return logger.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    @Override
    public void trace(String s) {
        logger.trace(s);
    }

    @Override
    public void trace(String s, Object o) {
        logger.trace(s,o);
    }

    @Override
    public void trace(String s, Object o, Object o1) {
        logger.trace(s,o,o1);
    }

    @Override
    public void trace(String s, Object... objects) {
        logger.info(s,objects);
    }

    @Override
    public void trace(String s, Throwable throwable) {
        logger.trace(s,throwable);
    }

    @Override
    public boolean isTraceEnabled(Marker marker) {
        return isTraceEnabled(marker);
    }

    @Override
    public void trace(Marker marker, String s) {
        logger.trace(marker,s);
    }

    @Override
    public void trace(Marker marker, String s, Object o) {
        logger.trace(marker,s,o);
    }

    @Override
    public void trace(Marker marker, String s, Object o, Object o1) {
        logger.trace(marker,s,o,o1);
    }

    @Override
    public void trace(Marker marker, String s, Object... objects) {
        logger.trace(marker,s,objects);
    }

    @Override
    public void trace(Marker marker, String s, Throwable throwable) {
        logger.trace(marker,s,throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    @Override
    public void debug(String s) {
        logger.debug(s);
    }

    @Override
    public void debug(String s, Object o) {
        logger.debug(s,o);
    }

    @Override
    public void debug(String s, Object o, Object o1) {
        logger.debug(s,o,o1);
    }

    @Override
    public void debug(String s, Object... objects) {
        logger.debug(s,objects);
    }

    @Override
    public void debug(String s, Throwable throwable) {
        logger.debug(s,throwable);
    }

    @Override
    public boolean isDebugEnabled(Marker marker) {
        return logger.isDebugEnabled(marker);
    }

    @Override
    public void debug(Marker marker, String s) {
        logger.debug(marker,s);
    }

    @Override
    public void debug(Marker marker, String s, Object o) {
        logger.debug(marker,s,o);
    }

    @Override
    public void debug(Marker marker, String s, Object o, Object o1) {
        logger.debug(marker,s,o,o1);
    }

    @Override
    public void debug(Marker marker, String s, Object... objects) {
        logger.debug(marker,s,objects);
    }

    @Override
    public void debug(Marker marker, String s, Throwable throwable) {
        logger.debug(marker,s,throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    @Override
    public void info(String s) {
        logger.info(s);
    }

    @Override
    public void info(String s, Object o) {
        logger.info(s,o);
    }

    @Override
    public void info(String s, Object o, Object o1) {
        logger.info(s,o,o1);
    }

    @Override
    public void info(String s, Object... objects) {
        logger.info("日志信息打印：" + s,objects);
    }

    @Override
    public void info(String s, Throwable throwable) {
        logger.info("日志信息打印：" + s,throwable);
    }

    @Override
    public boolean isInfoEnabled(Marker marker) {
        return false;
    }

    @Override
    public void info(Marker marker, String s) {
        logger.info(marker,s);
    }

    @Override
    public void info(Marker marker, String s, Object o) {
        logger.info(marker,s,o);
    }

    @Override
    public void info(Marker marker, String s, Object o, Object o1) {
        logger.info(marker,s,o,o1);
    }

    @Override
    public void info(Marker marker, String s, Object... objects) {
        logger.info(marker,s,objects);
    }

    @Override
    public void info(Marker marker, String s, Throwable throwable) {
        logger.info(marker,s,throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    @Override
    public void warn(String s) {
        logger.warn(s);
    }

    @Override
    public void warn(String s, Object o) {
        logger.warn(s,o);
    }

    @Override
    public void warn(String s, Object... objects) {
        logger.warn(s,objects);
    }

    @Override
    public void warn(String s, Object o, Object o1) {
        logger.warn(s,o,o1);
    }

    @Override
    public void warn(String s, Throwable throwable) {
        logger.warn(s,throwable);
    }

    @Override
    public boolean isWarnEnabled(Marker marker) {
        return logger.isWarnEnabled(marker);
    }

    @Override
    public void warn(Marker marker, String s) {
        logger.warn(marker,s);
    }

    @Override
    public void warn(Marker marker, String s, Object o) {
        logger.warn(marker,s,o);
    }

    @Override
    public void warn(Marker marker, String s, Object o, Object o1) {

    }

    @Override
    public void warn(Marker marker, String s, Object... objects) {
        logger.warn(marker,s,objects);
    }

    @Override
    public void warn(Marker marker, String s, Throwable throwable) {
        logger.warn(marker,s,throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    @Override
    public void error(String s) {
        logger.error(s);
    }

    @Override
    public void error(String s, Object o) {
        logger.error(s,o);
    }

    @Override
    public void error(String s, Object o, Object o1) {
        logger.error(s,o,o1);
    }

    @Override
    public void error(String s, Object... objects) {
        logger.error(s,objects);
    }

    @Override
    public void error(String s, Throwable throwable) {
        logger.error(s,throwable);
    }

    @Override
    public boolean isErrorEnabled(Marker marker) {
        return logger.isErrorEnabled(marker);
    }

    @Override
    public void error(Marker marker, String s) {
        logger.error(marker,s);
    }

    @Override
    public void error(Marker marker, String s, Object o) {
        logger.error(marker,s,o);
    }

    @Override
    public void error(Marker marker, String s, Object o, Object o1) {
        logger.error(marker,s,o,o1);
    }

    @Override
    public void error(Marker marker, String s, Object... objects) {
        logger.error(marker,s,objects);
    }

    @Override
    public void error(Marker marker, String s, Throwable throwable) {
        logger.error(marker,s,throwable);
    }

    public void print(HttpRequest request){
        FilterWrapper filterWrapper = new FilterWrapper("jd.com",null,null,null);
        //看是否符合过滤规则；
        if(filterWrapper.isFilter(request)){
            logger.info("start---------------------------------------------");
            logger.info(" {} {} {}",request.getMethod(),request.getUri(),request.getProtocolVersion());
            print(request.getUri(),request.headers());
            logger.info("end-----------------------------------------------");
        }
    }
    private void print(String uri,HttpHeaders headers){
        headers.forEach(header->{
            logger.info("{}[{} - {}]",uri,header.getKey(),header.getValue());
        });
    }
    
}
