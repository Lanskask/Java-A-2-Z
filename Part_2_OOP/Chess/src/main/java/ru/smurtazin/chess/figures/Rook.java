package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 05.02.17.
 */
public class Rook extends Figure {
    public Rook(Color color) {
        super(FigureType.ROOK, color);
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        if (nowCoordinate == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if   (
                        (
                            ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0 )
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
        }
    }
}
