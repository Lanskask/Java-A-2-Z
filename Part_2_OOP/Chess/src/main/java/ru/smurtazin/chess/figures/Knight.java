package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 05.02.17.
 */
public class Knight extends Figure {
    public Knight(Color color) {
        super(FigureType.KNIGHT, color);
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
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
        }
    }
}
