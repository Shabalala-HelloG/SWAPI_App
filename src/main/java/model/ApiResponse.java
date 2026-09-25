package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ApiResponse<T> {

    @JsonProperty("count")
    private String count;

    @JsonProperty("next")
    private String next;

    @JsonProperty("previous")
    private String previous;

    @JsonProperty("results")
    private List<T> results;

    public ApiResponse() {
    }

    public String getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public String getPrevious() {
        return previous;
    }

    public List<T> getResults() {
        return results;
    }
}
