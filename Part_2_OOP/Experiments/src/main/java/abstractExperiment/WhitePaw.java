package abstractExperiment;

/**
 * Created by 1 on 25.01.2017.
 */
public class WhitePaw extends Paw {

    void writeColor() {
        System.out.println("Color: " + super.getColor());
    }

    @Override
    void movement() {
        super.movement();
    }

    @Override
    void eat() {
        System.out.println("Figure eat");
    }
}
