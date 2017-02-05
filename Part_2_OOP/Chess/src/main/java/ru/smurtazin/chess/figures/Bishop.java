package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 05.02.17.
 */
public class Bishop extends Figure {
    public Bishop(Color color) {
        super(FigureType.BISHOP, color);
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        if (nowCoordinate == newCoordinate) {
            System.out.println("You place your figure on the same place");
        } else if   (
                        (
                            xAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                            ==
                            yAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                        )
                    )
        {
            this.setNowCoordinate(newCoordinate);
        }
    }
}
