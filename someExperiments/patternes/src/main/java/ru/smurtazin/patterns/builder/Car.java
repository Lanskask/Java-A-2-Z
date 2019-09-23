package ru.smurtazin.patterns.builder;

public class Car {
    int seats;
    String engine;
    String tripComp;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTripComp() {
        return tripComp;
    }

    public void setTripComp(String tripComp) {
        this.tripComp = tripComp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + getSeats() +
                ", engine='" + getEngine() + '\'' +
                ", tripComp='" + getTripComp() + '\'' +
                '}';
    }
}