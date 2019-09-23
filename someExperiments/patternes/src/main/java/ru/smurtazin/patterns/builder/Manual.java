package ru.smurtazin.patterns.builder;

public class Manual {
    int seats;
    String engine;
    String tripComp;

    public String getSeats() {
        return "Num of seats: " + seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return "Engine: " + engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTripComp() {
        return "TripComp: " + tripComp;
    }

    public void setTripComp(String tripComp) {
        this.tripComp = tripComp;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + getSeats() +
                ", engine='" + getEngine() + '\'' +
                ", tripComp='" + getTripComp() + '\'' +
                '}';
    }
}
