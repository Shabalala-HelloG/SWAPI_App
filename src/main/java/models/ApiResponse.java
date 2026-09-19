package models;

import java.util.List;

public class ApiResponse<T> {

    public String count;
    public String next;
    public String previous;
    public List<T> results;

    public ApiResponse(String count,
                       String next,
                       String previous,
                       List<T> results
    ) {
        this.count = count;
        this.next = next;
        this.previous = previous;
        this.results = results;
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
