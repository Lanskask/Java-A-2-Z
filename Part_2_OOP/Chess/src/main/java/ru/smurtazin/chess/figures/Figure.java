package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 23.01.17.
 */
//public interface Figure {
public abstract class Figure {

    public enum Color { WHITE, BLACK }
    public enum FigureType { PAWN, KING, QUEEN, ROOK, KNIGHT, BISHOP }
    public enum Side { LEFT, RIGHT }

    public Figure() {}

    public Figure(FigureType figureType, Color color, Side figureSide) {
        this.figureType = figureType;
        this.color = color;
        this.figureSide = figureSide;
    }

    public Figure(FigureType figureType, Color color, Coordinate.XCoordinate initialXCoordinate) {
        this.figureType = figureType;
        this.color = color;
        this.initialCoordinate.xCoordinate = initialXCoordinate;
    }

    public Figure(FigureType figureType, Color color) {
        this.figureType = figureType;
        this.color = color;
    }

    public Figure(FigureType figureType) {
        this.figureType = figureType;
    }

    private FigureType figureType;
    private Color color;
    private Side figureSide;
    public Coordinate nowCoordinate; // TODO: Actuaaly it should be private
    public Coordinate initialCoordinate; // TODO: Actuaaly it should be private

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

    public void setNowCoordinate(Coordinate nowCoordinate) {
        this.nowCoordinate = nowCoordinate;
    }

    public Coordinate getNowCoordinate() {
        return this.nowCoordinate;
    }

    public void setInitialCoordinateBigFigure(Coordinate initialCoordinate) {
        // YCoordinate
        if(color == Color.WHITE) {
            initialCoordinate.yCoordinate = Coordinate.YCoordinate._1;
        } else {
            initialCoordinate.yCoordinate = Coordinate.YCoordinate._8;
        }
        // XCoordinate
        if (figureType == FigureType.KING) {
            initialCoordinate.xCoordinate = Coordinate.XCoordinate.D;
        } else if (figureType == FigureType.QUEEN) {
            initialCoordinate.xCoordinate = Coordinate.XCoordinate.E;
        } else if (figureType == FigureType.ROOK) {
            // TODO: Side relative to the viewer or to, for example, the white figures user ?
            // TODO: Side relative to the white figures user!
            if(figureSide == Side.LEFT) {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.A;
            } else {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.H;
            }
        } else if (figureType == FigureType.KNIGHT) {
            if(figureSide == Side.LEFT) {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.B;
            } else {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.G;
            }
        } else { //if (figureType == FigureType.BISHOP) {
            if(figureSide == Side.LEFT) {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.C;
            } else {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.F;
            }
        }
        this.initialCoordinate = initialCoordinate;
    }

    public void setInitialYCoordinatePaw(Color color) { // TODO: Will it work or not?
        if (color == Color.WHITE) {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._7;
        } else {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._2;
        }
    }

    public void setInitialXCoordinatePaw(Coordinate.XCoordinate xCoordinatePaw) {
        this.initialCoordinate.xCoordinate = xCoordinatePaw;
    }

    /*public void setInitialCoordinatePaw(Color color) { // TODO: Will it work or not?
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.initialCoordinate.xCoordinate = xCoordinate;
        }
        if (color == Color.WHITE) {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._7;
        } else {
            this.initialCoordinate.yCoordinate = Coordinate.YCoordinate._2;
        }
    }*/

    public Coordinate getInitialCoordinate() {
        return initialCoordinate;
    }

    public abstract void movement(Coordinate newCoordinate);

//    public abstract void eat(Coordinate newCoordinate);
}
