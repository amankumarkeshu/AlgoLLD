package Uber_LLD.Entity;

public class Driver {

    boolean isAvailable;

    String name;
    int rating;

    public Driver(String name) {
        this.name = name;
        this.isAvailable = true;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
