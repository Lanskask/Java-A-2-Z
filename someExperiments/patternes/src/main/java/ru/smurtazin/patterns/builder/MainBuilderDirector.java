package ru.smurtazin.patterns.builder;

public class MainBuilderDirector {
    public static void main(String[] args) {
        MainBuilderDirector main = new MainBuilderDirector();
        main.run();
    }

    void run() {
        this.makeCar();
    }


    /**
     * Make some car and some Man (не обязательно к тойже машине)
     */
    void makeCar() {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        CarManualBuilder carManualBuilder = new CarManualBuilder();

        /**
         * Need some thing of sportCar - that is why call sportCar
         * What it should back? - It should back that we put as parametr
         */
        director.setupNewSportCarBuilder(carBuilder);
        director.setupNewSportCarBuilder(carManualBuilder);

        Car car = carBuilder.getResult();
        Manual manual = carManualBuilder.getResult();

        System.out.println("It's a car after carBuilder after setupNewSportCarBuilder:\n\t" + car.toString());
        System.out.println("It's a car after carManualBuilder after setupNewSportCarBuilder:\n\t" + manual.toString());
    }
}
