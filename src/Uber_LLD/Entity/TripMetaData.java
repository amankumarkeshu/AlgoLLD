package Uber_LLD.Entity;

public class TripMetaData {


    int riderRating;
    int driverRating;
    Location src;
    Location des;

    public Location getSrc() {
        return src;
    }

    public Location getDes() {
        return des;
    }

    public int getRiderRating() {
        return riderRating;
    }

    public int getDriverRating() {
        return driverRating;
    }

    public void setDriverRating(int driverRating) {
        this.driverRating = driverRating;
    }

    public TripMetaData(int riderRating, Location src, Location des) {
        this.riderRating = riderRating;
        this.src = src;
        this.des = des;
    }
}
