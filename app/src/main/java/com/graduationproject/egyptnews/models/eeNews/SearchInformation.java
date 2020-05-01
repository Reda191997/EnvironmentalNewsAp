
package com.graduationproject.egyptnews.models.eeNews;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SearchInformation implements Serializable
{

    @SerializedName("searchTime")
    @Expose
    private double searchTime;
    @SerializedName("formattedSearchTime")
    @Expose
    private String formattedSearchTime;
    @SerializedName("totalResults")
    @Expose
    private String totalResults;
    @SerializedName("formattedTotalResults")
    @Expose
    private String formattedTotalResults;
    private final static long serialVersionUID = 3888908636183903682L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SearchInformation() {
    }

    /**
     * 
     * @param searchTime
     * @param totalResults
     * @param formattedTotalResults
     * @param formattedSearchTime
     */
    public SearchInformation(double searchTime, String formattedSearchTime, String totalResults, String formattedTotalResults) {
        super();
        this.searchTime = searchTime;
        this.formattedSearchTime = formattedSearchTime;
        this.totalResults = totalResults;
        this.formattedTotalResults = formattedTotalResults;
    }

    public double getSearchTime() {
        return searchTime;
    }

    public void setSearchTime(double searchTime) {
        this.searchTime = searchTime;
    }

    public String getFormattedSearchTime() {
        return formattedSearchTime;
    }

    public void setFormattedSearchTime(String formattedSearchTime) {
        this.formattedSearchTime = formattedSearchTime;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getFormattedTotalResults() {
        return formattedTotalResults;
    }

    public void setFormattedTotalResults(String formattedTotalResults) {
        this.formattedTotalResults = formattedTotalResults;
    }

}
