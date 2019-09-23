package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class King extends Figure {
    public King(Color color) {
        super(FigureType.KING, color);
    }

    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) {
        return null;
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate();

        if (nowCoordinate == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if (
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
                ) {
            this.setNowCoordinate(newCoordinate);
        } else {
            throw new ImpossibleMovementException("Impossible movement");
        }
    }
}
