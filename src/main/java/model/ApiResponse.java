package model;

import java.util.List;

public class ApiResponse<T> {

    private String count;
    private String next;
    private String previous;
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
