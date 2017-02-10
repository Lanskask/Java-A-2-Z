package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 23.01.17.
 */
//public interface Figure {
public abstract class Figure {

    // ------- Enums ---------------
    public enum Color { WHITE, BLACK }
    public enum FigureType { PAWN, KING, QUEEN, ROOK, KNIGHT, BISHOP }
    public enum Side { LEFT, RIGHT }

    // ------- Constructors ---------------
    public Figure() {}

    public Figure(FigureType figureType, Color color, Side figureSide) {
        this.figureType = figureType;
        this.color = color;
        this.figureSide = figureSide;
        this.setFigureSign();
    }

    // need for Paws
    public Figure(FigureType figureType, Color color, Coordinate.XCoordinate initialXCoordinate) {
        this.figureType = figureType;
        this.color = color;
        this.initialCoordinate.xCoordinate = initialXCoordinate;

        this.setFigureSign();
        if(figureType != FigureType.PAWN) {
            this.setInitialCoordinateBigFigure();
        } else {
            this.setInitialXCoordinatePaw(initialXCoordinate);
            this.setInitialYCoordinatePaw(color);
        }
    }

    public Figure(FigureType figureType, Color color) {
        this.figureType = figureType;
        this.color = color;

        this.setFigureSign();
        if(figureType != FigureType.PAWN) {
            this.setInitialCoordinateBigFigure();
        }

        this.nowCoordinate = this.initialCoordinate;
    }

    public Figure(FigureType figureType) {
        this.figureType = figureType;
        this.setFigureSign();
    }

    // ------- Fields ---------------
    private FigureType figureType;
    private Color color;
    private Side figureSide;
    private String figureSign;
    public Coordinate nowCoordinate = new Coordinate();
    public Coordinate initialCoordinate = new Coordinate();

    // ------- For coordinate diffs ---------------
    public int xAbsCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return Math.abs( newCoordinate.xCoordinate.getCoordValue()
                - nowCoordinate.xCoordinate.getCoordValue() );
    }

    public int yAbsCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return Math.abs( newCoordinate.yCoordinate.getCoordValue()
                - nowCoordinate.yCoordinate.getCoordValue() );
    }

    public int yCoordDiff(Coordinate nowCoordinate, Coordinate newCoordinate) {
        return ( newCoordinate.yCoordinate.getCoordValue()
                - nowCoordinate.yCoordinate.getCoordValue() );
    }

    // ------- Abstract Methods ---------------
    public abstract ArrayList<Coordinate> track(Coordinate newCoordinate);

    public abstract void movement(Coordinate newCoordinate) throws
            ImpossibleMovementException;

    // ------- Just Setters and Getters ---------------
    public void setFigureType(FigureType figureType) {
        this.figureType = figureType;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public void setColor(Color color){
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setFigureSide(Side figureSide) {
        this.figureSide = figureSide;
    }

    public Side getFigureSide() {
        return figureSide;
    }

    public void setFigureSign() {
        if(this.color == Color.BLACK) {
            if (this.figureType == FigureType.KING) {
                this.figureSign = "\u265A";
            } else if (figureType == FigureType.QUEEN) {
                this.figureSign = "\u265B";
            } else if (figureType == FigureType.ROOK) {
                this.figureSign = "\u265C";
            } else if (figureType == FigureType.KNIGHT) {
                this.figureSign = "\u265E";
            } else if (figureType == FigureType.BISHOP) {
                this.figureSign = "\u265D";
            } else { //if (figureType == FigureType.PAW) {
                this.figureSign = "\u265F";
            }
        } else { // if (FigureColor == Color.WHITE) {
            if (this.figureType == FigureType.KING) {
                this.figureSign = "\u2654";
            } else if (figureType == FigureType.QUEEN) {
                this.figureSign = "\u2655";
            } else if (figureType == FigureType.ROOK) {
                this.figureSign = "\u2656";
            } else if (figureType == FigureType.KNIGHT) {
                this.figureSign = "\u2658";
            } else if (figureType == FigureType.BISHOP) {
                this.figureSign = "\u2657";
            } else { //if (figureType == FigureType.PAW) {
                this.figureSign = "\u2659";
            }
        }
    }

    public String getFigureSign() {
        return figureSign;
    }

    // ------- Coordinates --------
    public void setNowCoordinate(Coordinate nowCoordinate) {
        this.nowCoordinate = nowCoordinate;
    }

    public Coordinate getNowCoordinate() {
        return this.nowCoordinate;
    }

    public void setInitialCoordinateBigFigure() {

        // YCoordinate
        if(this.color == Color.WHITE) {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._1;
        } else {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._8;
        }

        // XCoordinate
        if (this.figureType == FigureType.KING) {
            this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.D;
        } else if (this.figureType == FigureType.QUEEN) {
            this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.E;
        } else if (this.figureType == FigureType.ROOK) {
            // TODO: Side relative to the white figures user!
            if(this.figureSide == Side.LEFT) {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.A;
            } else {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.H;
            }
        } else if (this.figureType == FigureType.KNIGHT) {
            if(this.figureSide == Side.LEFT) {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.B;
            } else {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.G;
            }
        } else { //if (figureType == FigureType.BISHOP) {
            if(this.figureSide == Side.LEFT) {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.C;
            } else {
                this.initialCoordinate.xCoordinate = Coordinate.XCoordinate.F;
            }
        }
//        this.initialCoordinate = initialCoordinate;
    }

    public void setInitialYCoordinatePaw(Color color) {
        if (color == Color.WHITE) {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._7;
        } else {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._2;
        }
    }

    public void setInitialXCoordinatePaw(Coordinate.XCoordinate xCoordinatePaw) {
        this.initialCoordinate.xCoordinate = xCoordinatePaw;
    }

    public void setInitialCoordinate(Coordinate initialCoordinate) {
        this.initialCoordinate = initialCoordinate;
    }

    public Coordinate getInitialCoordinate() {
        return initialCoordinate;
    }

}
