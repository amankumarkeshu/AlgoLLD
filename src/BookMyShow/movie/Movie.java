package BookMyShow.movie;


import BookMyShow.Users.Admin;

import java.util.Date;
import java.util.List;

public class Movie {
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String title;
    private String description;
    private int durationInMins;
    private String language;
    private Date releaseDate;
    private String city;
    private String genre;
    private Admin movieAddedBy;
    private List<Show> shows;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDurationInMins(int durationInMins) {
        this.durationInMins = durationInMins;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setMovieAddedBy(Admin movieAddedBy) {
        this.movieAddedBy = movieAddedBy;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getDurationInMins() {
        return durationInMins;
    }

    public String getLanguage() {
        return language;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getCity() {
        return city;
    }

    public String getGenre() {
        return genre;
    }

    public Admin getMovieAddedBy() {
        return movieAddedBy;
    }

    public List<Show> getShows(){
       return shows;
    }

}