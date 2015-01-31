package net.dongliu.requests;

import net.dongliu.requests.struct.Cookies;
import net.dongliu.requests.struct.Headers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * http response, with getStatusCode, headers, and data
 *
 * @author Dong Liu
 */
public class Response<T> {
    private int statusCode;
    private Headers headers;
    private Cookies cookies;
    private T body;

    private List<URI> history;

    Response() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Headers getHeaders() {
        return headers;
    }

    void setHeaders(Headers headers) {
        this.headers = headers;
    }

    public T getBody() {
        return body;
    }

    void setBody(T body) {
        this.body = body;
    }

    void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    /**
     * get cookies
     */
    public Cookies getCookies() {
        return this.cookies;
    }

    /**
     * redirect history urls.
     */
    public List<URI> getHistory() {
        return history;
    }

    void setHistory(List<URI> history) {
        this.history = history;
    }

}
