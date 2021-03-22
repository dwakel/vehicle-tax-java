package com.pluralsight.conferencedemo.Request;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class SearchAndSortRequest {
    private Map<String, Object> searchBy;
    private Map<String, Object> sortBy;
    private Integer page;
    private Integer perPage;

    public SearchAndSortRequest(@JsonProperty("searchBy") Map<String, Object> searchBy,
                                @JsonProperty("sortBy") Map<String, Object> sortBy,
                                @JsonProperty("page") Integer page,
                                @JsonProperty("perPage") Integer perPage)
    {
        this.searchBy = searchBy;
        this.sortBy = sortBy;
        this.page = page;
        this.perPage = perPage;
    }

    public Map<String, Object> getSearchBy() {
        return searchBy;
    }

    public Map<String, Object> getSortBy() {
        return sortBy;
    }

    public Integer getPage() {
        return page;
    }

    public Integer getPerPage() {
        return perPage;
    }
}
