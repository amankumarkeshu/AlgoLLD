package BookMyShow;

import BookMyShow.Enum.SeatType;
import BookMyShow.movie.CinemaHall;
import BookMyShow.movie.Movie;
import BookMyShow.movie.Show;
import BookMyShow.movie.ShowSeat;
import BookMyShow.search.Catalog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BMS_Main {

    public static void main(String args[]) {

        initialise();
    }
    private static void initialise() {
        createMovies();

        // create User



        // create Cinema
        List<CinemaHall>  cinemaHalls =  createCinema();

        // Create Show


        // Search Movies
        Catalog movieController = Catalog.getInstance();

        List<Movie> movies = movieController.searchByTitle("BAAHUBALI");

        System.out.println("Showing movies with title BAAHUBALI");

        Movie baahubali = null;
        for( Movie m : movies) {
            System.out.println(m.getTitle());
             baahubali = m;
        }


        Show show = new Show();
        show.setCreatedOn(new Date(2024,1, 12));

        show.setMovie(baahubali);
        show.setShowId(1);
        List<Show> shows = new ArrayList<>();
        shows.add(show);
        /// Add few more metaData related to the show
        CinemaHall cinemaHall = cinemaHalls.get(0);
        cinemaHall.setShows(shows);




        movies = movieController.searchByCity("Chennai");

        System.out.println("Showing movies in Chennai");
        for( Movie m : movies) {
            System.out.println(m.getTitle());
        }
        // Create Booking

        // fetchAvailableSeats from the cinema hall

        // List<Seats> seats = fetchAvailableSeat(6);

//        Booking newBooking = Booking.createBooking(show, seats , 1);


        // Make Payment

        // Show Bookings

    }

    private static void createMovies() {

        //create Movies1
        Movie avengers = new Movie();
        avengers.setId(1);
        avengers.setTitle("AVENGERS");
        avengers.setCity("Banglore");
        avengers.setReleaseDate(new Date(2023,1,12));
        avengers.setDurationInMins(128);

        //create Movies2
        Movie baahubali = new Movie();
        baahubali.setId(2);
        baahubali.setTitle("BAAHUBALI");
        baahubali.setCity("Chennai");
        baahubali.setReleaseDate(new Date(2024,1,12));
        baahubali.setDurationInMins(180);


        Catalog movieController = Catalog.getInstance();
        movieController.addMovie(avengers);
        movieController.addMovie(baahubali);
    }

    //creating 100 seats
    private static List<ShowSeat> createSeats() {

        //creating 100 seats for testing purpose, this can be generalised
        List<ShowSeat> seats = new ArrayList<>();

        //1 to 40 : SILVER
        for (int i = 0; i < 40; i++) {
            ShowSeat seat = new ShowSeat();
            seat.setShowSeatId(i);
            seat.setSeatType(SeatType.REGULAR);
            seats.add(seat);
        }

        //41 to 70 : SILVER
        for (int i = 40; i < 70; i++) {
            ShowSeat seat = new ShowSeat();
            seat.setShowSeatId(i);
            seat.setSeatType(SeatType.PREMIUM);
            seats.add(seat);
        }

        //71: 100 - RECLINER
        for (int i = 70; i < 100; i++) {
            ShowSeat seat = new ShowSeat();
            seat.setShowSeatId(i);
            seat.setSeatType(SeatType.RECLINER);
            seats.add(seat);
        }
        return seats;
    }


    private static List<CinemaHall> createCinema() {

        List<CinemaHall> screens = new ArrayList<>();
        CinemaHall screen1 = new CinemaHall();
        screen1.setName("Cinema1");
        screen1.setSeats(createSeats());
        screens.add(screen1);

        return screens;
    }


}
