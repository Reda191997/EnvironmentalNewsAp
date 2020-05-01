
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News implements Serializable
{

    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("url")
    @Expose
    private Url url;
    @SerializedName("queries")
    @Expose
    private Queries queries;
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("searchInformation")
    @Expose
    private SearchInformation searchInformation;
    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    private final static long serialVersionUID = -4628865808144358157L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public News() {
    }

    /**
     * 
     * @param kind
     * @param context
     * @param queries
     * @param searchInformation
     * @param items
     * @param url
     */
    public News(String kind, Url url, Queries queries, Context context, SearchInformation searchInformation, List<Item> items) {
        super();
        this.kind = kind;
        this.url = url;
        this.queries = queries;
        this.context = context;
        this.searchInformation = searchInformation;
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Queries getQueries() {
        return queries;
    }

    public void setQueries(Queries queries) {
        this.queries = queries;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public SearchInformation getSearchInformation() {
        return searchInformation;
    }

    public void setSearchInformation(SearchInformation searchInformation) {
        this.searchInformation = searchInformation;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}
