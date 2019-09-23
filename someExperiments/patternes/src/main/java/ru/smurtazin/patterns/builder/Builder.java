package ru.smurtazin.patterns.builder;

public interface Builder {
    void reset();
    void setSeats(int numOfSeats);
    void setEngine(String engine);
    void setTripComp(String tripComp);
}
