package abstractExperiment;

/**
 * Created by 1 on 25.01.2017.
 */
public abstract class Paw extends Figure {
    @Override
    void movement() {
        System.out.println("Figure moves 1.");
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }
}
