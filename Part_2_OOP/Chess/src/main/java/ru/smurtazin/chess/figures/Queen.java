package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class Queen extends Figure {
    public Queen(Color color) {
        super(FigureType.QUEEN, color);
    }

    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) {
        return null;
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate();
        try {
            if (nowCoordinate  == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if   (
                           (
                               xAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                               ==
                               yAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                           )
                           ||
                           (
                                ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0)
                                &&
                                ( yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 0 )
                           )
                           ||
                           (
                                ( yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0 )
                                &&
                                ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 0 )
                           )
                        )
            {
                this.setNowCoordinate(newCoordinate);
            } else {
                throw new ImpossibleMovementException("Impossible movement");
            }
        } catch (ImpossibleMovementException ime) {
            throw ime;
        }
    }
}
