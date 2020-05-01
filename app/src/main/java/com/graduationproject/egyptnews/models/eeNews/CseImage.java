
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CseImage implements Serializable
{

    @SerializedName("src")
    @Expose
    private String src;
    private final static long serialVersionUID = 4381010760717738147L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CseImage() {
    }

    /**
     * 
     * @param src
     */
    public CseImage(String src) {
        super();
        this.src = src;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

}
