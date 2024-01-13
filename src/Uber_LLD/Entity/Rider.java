package Uber_LLD.Entity;

public class Rider{

    String name;
    int rating;

    public Rider(String name) {
        this.name = name;
        this.rating = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
