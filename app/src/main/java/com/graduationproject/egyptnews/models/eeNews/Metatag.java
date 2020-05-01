
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metatag implements Serializable
{

    @SerializedName("og:image")
    @Expose
    private String ogImage;
    @SerializedName("og:type")
    @Expose
    private String ogType;
    @SerializedName("article:section")
    @Expose
    private String articleSection;
    @SerializedName("article:published_time")
    @Expose
    private String articlePublishedTime;
    @SerializedName("og:image:width")
    @Expose
    private String ogImageWidth;
    @SerializedName("twitter:card")
    @Expose
    private String twitterCard;
    @SerializedName("twitter:title")
    @Expose
    private String twitterTitle;
    @SerializedName("og:site_name")
    @Expose
    private String ogSiteName;
    @SerializedName("og:title")
    @Expose
    private String ogTitle;
    @SerializedName("og:image:height")
    @Expose
    private String ogImageHeight;
    @SerializedName("og:image:type")
    @Expose
    private String ogImageType;
    @SerializedName("og:updated_time")
    @Expose
    private String ogUpdatedTime;
    @SerializedName("og:description")
    @Expose
    private String ogDescription;
    @SerializedName("twitter:image")
    @Expose
    private String twitterImage;
    @SerializedName("fb:app_id")
    @Expose
    private String fbAppId;
    @SerializedName("article:modified_time")
    @Expose
    private String articleModifiedTime;
    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("twitter:description")
    @Expose
    private String twitterDescription;
    @SerializedName("og:locale")
    @Expose
    private String ogLocale;
    @SerializedName("og:url")
    @Expose
    private String ogUrl;
    @SerializedName("theme-color")
    @Expose
    private String themeColor;
    @SerializedName("twitter:url")
    @Expose
    private String twitterUrl;
    @SerializedName("og:app_id")
    @Expose
    private String ogAppId;
    @SerializedName("abstract")
    @Expose
    private String _abstract;
    @SerializedName("twitter:creator")
    @Expose
    private String twitterCreator;
    @SerializedName("fb:pages")
    @Expose
    private String fbPages;
    @SerializedName("og:admins")
    @Expose
    private String ogAdmins;
    @SerializedName("twitter:site")
    @Expose
    private String twitterSite;
    @SerializedName("fb:admins")
    @Expose
    private String fbAdmins;
    @SerializedName("apple-itunes-app")
    @Expose
    private String appleItunesApp;
    @SerializedName("article:author")
    @Expose
    private String articleAuthor;
    @SerializedName("og:image:secure_url")
    @Expose
    private String ogImageSecureUrl;
    @SerializedName("article:tag")
    @Expose
    private String articleTag;
    @SerializedName("msapplication-tilecolor")
    @Expose
    private String msapplicationTilecolor;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("msapplication-tileimage")
    @Expose
    private String msapplicationTileimage;
    @SerializedName("article:publisher")
    @Expose
    private String articlePublisher;
    private final static long serialVersionUID = -8746797574457475884L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Metatag() {
    }

    /**
     * 
     * @param twitterCreator
     * @param twitterTitle
     * @param ogImageWidth
     * @param twitterUrl
     * @param ogTitle
     * @param ogUpdatedTime
     * @param title
     * @param ogType
     * @param articleTag
     * @param twitterCard
     * @param msapplicationTileimage
     * @param ogImageHeight
     * @param fbAdmins
     * @param ogSiteName
     * @param appleItunesApp
     * @param ogImageSecureUrl
     * @param ogAdmins
     * @param twitterSite
     * @param fbPages
     * @param articlePublishedTime
     * @param twitterImage
     * @param author
     * @param ogDescription
     * @param ogImage
     * @param ogImageType
     * @param ogLocale
     * @param _abstract
     * @param articlePublisher
     * @param viewport
     * @param twitterDescription
     * @param themeColor
     * @param msapplicationTilecolor
     * @param ogUrl
     * @param ogAppId
     * @param articleSection
     * @param articleModifiedTime
     * @param fbAppId
     * @param articleAuthor
     */
    public Metatag(String ogImage, String ogType, String articleSection, String articlePublishedTime, String ogImageWidth, String twitterCard, String twitterTitle, String ogSiteName, String ogTitle, String ogImageHeight, String ogImageType, String ogUpdatedTime, String ogDescription, String twitterImage, String fbAppId, String articleModifiedTime, String viewport, String twitterDescription, String ogLocale, String ogUrl, String themeColor, String twitterUrl, String ogAppId, String _abstract, String twitterCreator, String fbPages, String ogAdmins, String twitterSite, String fbAdmins, String appleItunesApp, String articleAuthor, String ogImageSecureUrl, String articleTag, String msapplicationTilecolor, String author, String title, String msapplicationTileimage, String articlePublisher) {
        super();
        this.ogImage = ogImage;
        this.ogType = ogType;
        this.articleSection = articleSection;
        this.articlePublishedTime = articlePublishedTime;
        this.ogImageWidth = ogImageWidth;
        this.twitterCard = twitterCard;
        this.twitterTitle = twitterTitle;
        this.ogSiteName = ogSiteName;
        this.ogTitle = ogTitle;
        this.ogImageHeight = ogImageHeight;
        this.ogImageType = ogImageType;
        this.ogUpdatedTime = ogUpdatedTime;
        this.ogDescription = ogDescription;
        this.twitterImage = twitterImage;
        this.fbAppId = fbAppId;
        this.articleModifiedTime = articleModifiedTime;
        this.viewport = viewport;
        this.twitterDescription = twitterDescription;
        this.ogLocale = ogLocale;
        this.ogUrl = ogUrl;
        this.themeColor = themeColor;
        this.twitterUrl = twitterUrl;
        this.ogAppId = ogAppId;
        this._abstract = _abstract;
        this.twitterCreator = twitterCreator;
        this.fbPages = fbPages;
        this.ogAdmins = ogAdmins;
        this.twitterSite = twitterSite;
        this.fbAdmins = fbAdmins;
        this.appleItunesApp = appleItunesApp;
        this.articleAuthor = articleAuthor;
        this.ogImageSecureUrl = ogImageSecureUrl;
        this.articleTag = articleTag;
        this.msapplicationTilecolor = msapplicationTilecolor;
        this.author = author;
        this.title = title;
        this.msapplicationTileimage = msapplicationTileimage;
        this.articlePublisher = articlePublisher;
    }

    public String getOgImage() {
        return ogImage;
    }

    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    public String getOgType() {
        return ogType;
    }

    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    public String getArticleSection() {
        return articleSection;
    }

    public void setArticleSection(String articleSection) {
        this.articleSection = articleSection;
    }

    public String getArticlePublishedTime() {
        return articlePublishedTime;
    }

    public void setArticlePublishedTime(String articlePublishedTime) {
        this.articlePublishedTime = articlePublishedTime;
    }

    public String getOgImageWidth() {
        return ogImageWidth;
    }

    public void setOgImageWidth(String ogImageWidth) {
        this.ogImageWidth = ogImageWidth;
    }

    public String getTwitterCard() {
        return twitterCard;
    }

    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    public String getTwitterTitle() {
        return twitterTitle;
    }

    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    public String getOgSiteName() {
        return ogSiteName;
    }

    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

    public String getOgTitle() {
        return ogTitle;
    }

    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    public String getOgImageHeight() {
        return ogImageHeight;
    }

    public void setOgImageHeight(String ogImageHeight) {
        this.ogImageHeight = ogImageHeight;
    }

    public String getOgImageType() {
        return ogImageType;
    }

    public void setOgImageType(String ogImageType) {
        this.ogImageType = ogImageType;
    }

    public String getOgUpdatedTime() {
        return ogUpdatedTime;
    }

    public void setOgUpdatedTime(String ogUpdatedTime) {
        this.ogUpdatedTime = ogUpdatedTime;
    }

    public String getOgDescription() {
        return ogDescription;
    }

    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    public String getTwitterImage() {
        return twitterImage;
    }

    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    public String getFbAppId() {
        return fbAppId;
    }

    public void setFbAppId(String fbAppId) {
        this.fbAppId = fbAppId;
    }

    public String getArticleModifiedTime() {
        return articleModifiedTime;
    }

    public void setArticleModifiedTime(String articleModifiedTime) {
        this.articleModifiedTime = articleModifiedTime;
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getTwitterDescription() {
        return twitterDescription;
    }

    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    public String getOgLocale() {
        return ogLocale;
    }

    public void setOgLocale(String ogLocale) {
        this.ogLocale = ogLocale;
    }

    public String getOgUrl() {
        return ogUrl;
    }

    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public String getOgAppId() {
        return ogAppId;
    }

    public void setOgAppId(String ogAppId) {
        this.ogAppId = ogAppId;
    }

    public String getAbstract() {
        return _abstract;
    }

    public void setAbstract(String _abstract) {
        this._abstract = _abstract;
    }

    public String getTwitterCreator() {
        return twitterCreator;
    }

    public void setTwitterCreator(String twitterCreator) {
        this.twitterCreator = twitterCreator;
    }

    public String getFbPages() {
        return fbPages;
    }

    public void setFbPages(String fbPages) {
        this.fbPages = fbPages;
    }

    public String getOgAdmins() {
        return ogAdmins;
    }

    public void setOgAdmins(String ogAdmins) {
        this.ogAdmins = ogAdmins;
    }

    public String getTwitterSite() {
        return twitterSite;
    }

    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    public String getFbAdmins() {
        return fbAdmins;
    }

    public void setFbAdmins(String fbAdmins) {
        this.fbAdmins = fbAdmins;
    }

    public String getAppleItunesApp() {
        return appleItunesApp;
    }

    public void setAppleItunesApp(String appleItunesApp) {
        this.appleItunesApp = appleItunesApp;
    }

    public String getArticleAuthor() {
        return articleAuthor;
    }

    public void setArticleAuthor(String articleAuthor) {
        this.articleAuthor = articleAuthor;
    }

    public String getOgImageSecureUrl() {
        return ogImageSecureUrl;
    }

    public void setOgImageSecureUrl(String ogImageSecureUrl) {
        this.ogImageSecureUrl = ogImageSecureUrl;
    }

    public String getArticleTag() {
        return articleTag;
    }

    public void setArticleTag(String articleTag) {
        this.articleTag = articleTag;
    }

    public String getMsapplicationTilecolor() {
        return msapplicationTilecolor;
    }

    public void setMsapplicationTilecolor(String msapplicationTilecolor) {
        this.msapplicationTilecolor = msapplicationTilecolor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsapplicationTileimage() {
        return msapplicationTileimage;
    }

    public void setMsapplicationTileimage(String msapplicationTileimage) {
        this.msapplicationTileimage = msapplicationTileimage;
    }

    public String getArticlePublisher() {
        return articlePublisher;
    }

    public void setArticlePublisher(String articlePublisher) {
        this.articlePublisher = articlePublisher;
    }

}
