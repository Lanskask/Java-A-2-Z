package abstractExperiment;

/**
 * Created by 1 on 25.01.2017.
 */
public abstract class Figure {
    String color;

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    abstract void movement();

    abstract void eat();

}
