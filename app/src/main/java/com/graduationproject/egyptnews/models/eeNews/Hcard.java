
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Hcard implements Serializable
{

    @SerializedName("url_text")
    @Expose
    private String urlText;
    @SerializedName("fn")
    @Expose
    private String fn;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 3971072771012168544L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Hcard() {
    }

    /**
     * 
     * @param urlText
     * @param fn
     * @param url
     */
    public Hcard(String urlText, String fn, String url) {
        super();
        this.urlText = urlText;
        this.fn = fn;
        this.url = url;
    }

    public String getUrlText() {
        return urlText;
    }

    public void setUrlText(String urlText) {
        this.urlText = urlText;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
