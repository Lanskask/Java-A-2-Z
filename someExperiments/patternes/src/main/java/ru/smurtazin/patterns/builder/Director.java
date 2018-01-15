package ru.smurtazin.patterns.builder;

public class Director {
    // У директора может быть много Builderov,
    // и вообще  он должен и может работать вообще с кучей различных Builderov,
    // разных видов с кучей объектов и т.д.
    /*Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }*/

    void setupNewSportCarBuilder(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Powerfull");
        builder.setTripComp("Expensive");
    }

    void setupNewHeavyCarBuilder(Builder builder) {
        builder.reset();
        builder.setSeats(6);
        builder.setEngine("Very Powerfull");
        builder.setTripComp("Cheepe");
    }

}
