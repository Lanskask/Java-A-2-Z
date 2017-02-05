package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 05.02.17.
 */
public class King extends Figure {
    King(Color color) {
        super(FigureType.KING, color);
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        if (nowCoordinate  == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if   (
                        (
                            Math.abs(
                                newCoordinate.xCoordinate.getCoordValue()
                                        -
                                        nowCoordinate.xCoordinate.getCoordValue()
                            ) == 1
                        )
                        ||
                        (
                            Math.abs(
                                newCoordinate.yCoordinate.getCoordValue()
                                -
                                nowCoordinate.yCoordinate.getCoordValue()
                            ) == 1
                        )
                    )
        {
            this.setNowCoordinate(newCoordinate);
        }
    }
}
