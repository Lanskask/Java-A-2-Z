package ru.smurtazin.patterns.builder;

public class CarManualBuilder implements Builder {
    Manual result;

    @Override
    public void reset() {
        this.result = new Manual();
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

    public Manual getResult() {
        return this.result;
    }
}