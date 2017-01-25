package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
public class Figures {

    int xAbsCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return Math.abs( newCoordinate.xCoordinate.getCoordValue()
                - nowCoordinate.xCoordinate.getCoordValue() );
    }

    int yAbsCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return Math.abs( newCoordinate.yCoordinate.getCoordValue()
                - nowCoordinate.yCoordinate.getCoordValue() );
    }

    int yCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return ( newCoordinate.yCoordinate.getCoordValue()
                - nowCoordinate.yCoordinate.getCoordValue() );
    }

    class WhitePawn extends Figure { // from Up
        WhitePawn() {
            super(FigureType.PAWN, Color.WHITE);
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

    class BlackPawn extends Figure { // from Bottom
        BlackPawn() {
            super(FigureType.PAWN, Color.BLACK);
        }

        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
            if (nowCoordinate == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if   (
                            yCoordDiff( nowCoordinate, newCoordinate) == 1
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
                                yCoordDiff( nowCoordinate, newCoordinate ) == 1
                    )
            {
                this.setNowCoordinate(newCoordinate);
            }
        }
    }

    class King extends Figure {
        King() {
            super(FigureType.KING);
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

    class Queen extends Figure {
        Queen() {
            super(FigureType.QUEEN);
        }

        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
            if (nowCoordinate  == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if (
                        (
                                xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) ==
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
            }
        }
    }

    class Rook extends Figure {
        Rook() {
            super(FigureType.ROOK);
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

    class Knight extends Figure {
        Knight() {
            super(FigureType.KNIGHT);
        }

        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
            if (nowCoordinate == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if (
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
                    ) {
                this.setNowCoordinate(newCoordinate);
            }
        }
    }

    class Bishop extends Figure {
        Bishop() {
            super(FigureType.BISHOP);
        }

        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
            if (nowCoordinate == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if (
                    (
                            xAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                                    ==
                                    yAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                    )
                    ) {
                this.setNowCoordinate(newCoordinate);
            }
        }
    }
}
