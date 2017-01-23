package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
public class Figures {

    class Pawn extends Figure {

    }

    class King extends Figure {
        FigureType figureType;



        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = this.getNowCoordinate();
            if (nowCoordinate  == newCoordinate) {
                System.out.println("You place your figure o the same place");
            } else if ( (Math.abs(newCoordinate.y - nowCoordinate.y) == 1 ) ||
                    ( Math.abs(newCoordinate.x - nowCoordinate.x) == 1)  ) {
                this.setNowCoordinate(newCoordinate);
            }
        }

        @Override
        void eat(Coordinate newCoordinate) {

        }
    }

    class Queen extends Figure {

    }

    class Rook extends Figure {

    }

    class Knight extends Figure {

    }

    class Bishop extends Figure {

    }
}
