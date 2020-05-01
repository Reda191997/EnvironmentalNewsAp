
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pagemap implements Serializable
{

    @SerializedName("cse_thumbnail")
    @Expose
    private List<CseThumbnail> cseThumbnail = null;
    @SerializedName("metatags")
    @Expose
    private List<Metatag> metatags = null;
    @SerializedName("cse_image")
    @Expose
    private List<CseImage> cseImage = null;
    @SerializedName("hcard")
    @Expose
    private List<Hcard> hcard = null;
    private final static long serialVersionUID = 7509303228726027470L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Pagemap() {
    }

    /**
     * 
     * @param hcard
     * @param cseImage
     * @param metatags
     * @param cseThumbnail
     */
    public Pagemap(List<CseThumbnail> cseThumbnail, List<Metatag> metatags, List<CseImage> cseImage, List<Hcard> hcard) {
        super();
        this.cseThumbnail = cseThumbnail;
        this.metatags = metatags;
        this.cseImage = cseImage;
        this.hcard = hcard;
    }

    public List<CseThumbnail> getCseThumbnail() {
        return cseThumbnail;
    }

    public void setCseThumbnail(List<CseThumbnail> cseThumbnail) {
        this.cseThumbnail = cseThumbnail;
    }

    public List<Metatag> getMetatags() {
        return metatags;
    }

    public void setMetatags(List<Metatag> metatags) {
        this.metatags = metatags;
    }

    public List<CseImage> getCseImage() {
        return cseImage;
    }

    public void setCseImage(List<CseImage> cseImage) {
        this.cseImage = cseImage;
    }

    public List<Hcard> getHcard() {
        return hcard;
    }

    public void setHcard(List<Hcard> hcard) {
        this.hcard = hcard;
    }

}
