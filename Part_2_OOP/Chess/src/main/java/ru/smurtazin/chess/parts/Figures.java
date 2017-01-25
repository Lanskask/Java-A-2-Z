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
        WhitePawn(Coordinate.XCoordinate initialXCoordinate) {
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

    class BlackPawn extends Figure { // from Bottom
        BlackPawn(Coordinate.XCoordinate initialXCoordinate) {
            super(FigureType.PAWN, Color.BLACK, initialXCoordinate);
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
        King(Color color) {
            super(FigureType.KING, color);
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
        Queen(Color color) {
            super(FigureType.QUEEN, color);
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
        Rook(Color color) {
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

    class Knight extends Figure {
        Knight(Color color) {
            super(FigureType.KNIGHT, color);
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
        Bishop(Color color) {
            super(FigureType.BISHOP, color);
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
