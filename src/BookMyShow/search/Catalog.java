package BookMyShow.search;

import BookMyShow.movie.Movie;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Catalog implements Search {
    HashMap<String, List<Movie>> movieTitles;
    HashMap<String, List<Movie>> movieLanguages;
    HashMap<String, List<Movie>> movieGenres;
    HashMap<Date, List<Movie>> movieReleaseDates;
    HashMap<String, List<Movie>> movieCities;

    public static Catalog instance = null;

    private Catalog() {
        movieReleaseDates = new HashMap<>();
        movieCities = new HashMap<>();
        movieGenres = new HashMap<>();
        movieTitles = new HashMap<>();
    }
    public static Catalog getInstance () {
        if ( instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public void addMovie(Movie movie) {

        List<Movie> movies = movieReleaseDates.getOrDefault(movie.getReleaseDate(), new ArrayList<>());
        movies.add(movie);
        movieReleaseDates.put(movie.getReleaseDate(), movies);

        movies = movieCities.getOrDefault(movie.getCity(), new ArrayList<>());
        movies.add(movie);

        movieCities.put(movie.getCity(), movies);

        movies = movieTitles.getOrDefault(movie.getTitle(), new ArrayList<>());
        movies.add(movie);
        movieTitles.put(movie.getTitle(), movies);
        // Add movies to language and genre

        System.out.println("Movie added to catalog title = " + movie.getTitle() + "in city " + movie.getCity());

    }



    public List<Movie> searchByTitle(String title) {
        return movieTitles.getOrDefault(title, null);
    }

    public List<Movie> searchByLanguage(String language) {
        return movieLanguages.getOrDefault(language, null);
    }


    public List<Movie> searchByCity(String cityName) {
        return movieCities.getOrDefault(cityName, null);
    }

    @Override
    public List<Movie> searchByGenre(String genre) {
        return  movieGenres.getOrDefault(genre, null);
    }

    @Override
    public List<Movie> searchByReleaseDate(Date releaseDate) {
        return movieReleaseDates.getOrDefault(releaseDate, null);
    }
}
