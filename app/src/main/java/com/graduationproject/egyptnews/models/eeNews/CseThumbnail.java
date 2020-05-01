
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseThumbnail implements Serializable
{

    @SerializedName("src")
    @Expose
    private String src;
    @SerializedName("width")
    @Expose
    private String width;
    @SerializedName("height")
    @Expose
    private String height;
    private final static long serialVersionUID = -7251630805825133840L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CseThumbnail() {
    }

    /**
     * 
     * @param src
     * @param width
     * @param height
     */
    public CseThumbnail(String src, String width, String height) {
        super();
        this.src = src;
        this.width = width;
        this.height = height;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

}
