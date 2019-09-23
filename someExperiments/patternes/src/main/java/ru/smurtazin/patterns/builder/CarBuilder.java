package ru.smurtazin.patterns.builder;

public class CarBuilder implements Builder {
    Car result;

    @Override
    public void reset() {
        result = new Car();
    }

    @Override
    public void setSeats(int numOfSeats) {
        this.result.setSeats(numOfSeats);
    }

    @Override
    public void setEngine(String engine) {
        this.result.setEngine(engine);
    }

    @Override
    public void setTripComp(String tripComp) {
        this.result.setTripComp(tripComp);
    }

    public Car getResult() {
        return this.result;
    }
}
