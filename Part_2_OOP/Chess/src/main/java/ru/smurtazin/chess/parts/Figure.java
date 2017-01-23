package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
//public interface Figure {
public abstract class Figure {

    public Figure(FigureType figureType, Color color, Side figureSide) {
        this.figureType = figureType;
        this.color = color;
        this.figureSide = figureSide;
    }

    enum Color {
        WHITE, BLACK
    }

    enum FigureType {
        PAWN, KING, QUEEN, ROOK, KNIGHT, BISHOP
    }

    enum Side {
        LEFT, RIGHT
    }

    private FigureType figureType;
    private Color color;
    private Side figureSide;
    private Coordinate nowCoordinate;
    private Coordinate initialCoordinate;

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

    Coordinate getNowCoordinate() {
        return this.nowCoordinate;
    }

    public void setInitialCoordinateBigFigure(Coordinate initialCoordinate) {
        if(color == Color.WHITE) {
            if (figureType == FigureType.KING) {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.D;
            } else if (figureType == FigureType.QUEEN) {
                initialCoordinate.xCoordinate = Coordinate.XCoordinate.E;
            } else if (figureType == FigureType.ROOK) {

            } else if (figureType == FigureType.KNIGHT) {
                if(figureSide == Side.LEFT) {

                } else {

                }
            } else if (figureType == FigureType.BISHOP) {
                if(figureSide == Side.LEFT) {

                } else {

                }
            } else {

            }

        } else {

        }
        this.initialCoordinate = initialCoordinate;
    }

    public void setInitialCoordinatePaw(Color color) {
        if (color == Color.WHITE) {
            for (Coordinate.YCoordinate yCoordinate : Coordinate.YCoordinate.values()) {

            }
        } else {

        }

    }

    public Coordinate getInitialCoordinate() {
        return initialCoordinate;
    }

    public abstract void movement(Coordinate newCoordinate);

    public abstract void eat(Coordinate newCoordinate);

}
