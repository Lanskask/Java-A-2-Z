package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 05.02.17.
 */
public class WhitePawn extends Figure { // from Up
    public WhitePawn(Coordinate.XCoordinate initialXCoordinate) {
        super(FigureType.PAWN, Color.WHITE, initialXCoordinate);
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        if (nowCoordinate == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if   (
                yCoordDiff( nowCoordinate, newCoordinate) == -1
                )
        {
            this.setNowCoordinate(newCoordinate);
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
