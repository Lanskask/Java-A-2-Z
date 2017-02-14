package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class Knight extends Figure {
    public Knight(Color color) {
        super(FigureType.KNIGHT, color);
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
        } else if   (
                        (
                            xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 3
                            &&
                            yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 1
                        )
                        ||
                        (
                            xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 1
                            &&
                            yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 3
                        )
                    )
        {
            this.setNowCoordinate(newCoordinate);
        } else {
            throw new ImpossibleMovementException("Impossible movement");
        }
    }

}
