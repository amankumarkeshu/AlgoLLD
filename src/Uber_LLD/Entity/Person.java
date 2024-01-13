package Uber_LLD.Entity;

public abstract class Person {
    String name;
    int rating;

    public Person(String name) {
        this.name = name;
        this.rating = 0;
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
