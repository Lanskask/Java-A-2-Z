package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class WhitePawn extends Figure { // from Up
    public WhitePawn(Coordinate.XCoordinate initialXCoordinate) {
        super(FigureType.PAWN, Color.WHITE, initialXCoordinate);
    }

    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) {
        return null;
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        try {
            if (nowCoordinate == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if (
                        yCoordDiff(nowCoordinate, newCoordinate) == -1
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

    public void eat(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        if (nowCoordinate == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if   (
                xAbsCoordDiff( nowCoordinate, newCoordinate )
                        ==
                        yAbsCoordDiff( nowCoordinate, newCoordinate )
                        &&
                        yCoordDiff( nowCoordinate, newCoordinate ) == -1
                )
        {
            this.setNowCoordinate(newCoordinate);
        }
    }
}
