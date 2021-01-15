package com.github.monkeywie.proxyee.model;

/**
 * 过滤器实体
 */
public class FilterEntity {

    private String uri;
    private String uriContains;
    private String host;
    private String port;

    public FilterEntity(String uri, String uriContains, String host, String port) {
        this.uri = uri;
        this.uriContains = uriContains;
        this.host = host;
        this.port = port;
    }


    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUriContains() {
        return uriContains;
    }

    public void setUriContains(String uriContains) {
        this.uriContains = uriContains;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
