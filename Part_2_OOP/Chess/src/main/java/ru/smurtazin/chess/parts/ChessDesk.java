package ru.smurtazin.chess.parts;

import ru.smurtazin.chess.figures.Coordinate;
/*import ru.smurtazin.chess.figures.Figure;
import ru.smurtazin.chess.figures.Figures;*/
import ru.smurtazin.chess.figures.*;

import java.util.ArrayList;

/**
 * Created by a1 on 23.01.17.
 */
public class ChessDesk {

    public ChessDesk() {
        this.fillFiguresArray();
        // TODO: What should be here OR leave it empty?
    }

    ArrayList<Figure> figuresArray = new ArrayList<Figure>();
    ArrayList<Figure> whitePawns = new ArrayList<Figure>();
    ArrayList<Figure> blackPawns = new ArrayList<Figure>();

    public void fillFiguresArray() {
        figuresArray.add(this.whiteKing);
        figuresArray.add(this.blackKing);

        figuresArray.add(this.whiteQueen);
        figuresArray.add(this.blackQueen);

        figuresArray.add(this.whiteRook);
        figuresArray.add(this.blackRook);

        figuresArray.add(this.whiteKnight);
        figuresArray.add(this.blackKnight);

        figuresArray.add(this.whiteBishop);
        figuresArray.add(this.blackBishop);

        // TODO: Is it right or not?:
        // TODO:    Does function addAll add array to the
        // TODO:        end of the first array, means concatenate two arrays?
        this.makeWhitePawnsArray();
        this.makeBlackPawnsArray();
        figuresArray.addAll(whitePawns);
        figuresArray.addAll(blackPawns);
    }

    King whiteKing = new King(Figure.Color.WHITE);
    King blackKing = new King(Figure.Color.BLACK);

    Queen whiteQueen = new Queen(Figure.Color.WHITE);
    Queen blackQueen = new Queen(Figure.Color.BLACK);

    Rook whiteRook = new Rook(Figure.Color.WHITE);
    Rook blackRook = new Rook(Figure.Color.BLACK);

    Knight whiteKnight = new Knight(Figure.Color.WHITE);
    Knight blackKnight = new Knight(Figure.Color.BLACK);

    Bishop whiteBishop = new Bishop(Figure.Color.WHITE);
    Bishop blackBishop = new Bishop(Figure.Color.BLACK);

    void makeWhitePawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.blackPawns.add(new WhitePawn(xCoordinate));
        }
    }

    void makeBlackPawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.blackPawns.add(new BlackPawn(xCoordinate));
        }
    }

    // --------- Methods to work with figuresArray ---------------
    // TODO: Is this method needed or not?
//    Coordinate getConcreteFigureCoorditanes(Figure.FigureType figureType, Figure.Color color) {
    Coordinate getConcreteFigureCoorditanes(Figure figure) {
        Coordinate coordinateOfNeededFigure = null;
        for(Figure figureFromArray : this.figuresArray) {
            if(figureFromArray == figure) {
                coordinateOfNeededFigure = figure.getNowCoordinate();
            }
        }
        return coordinateOfNeededFigure;
    }

    // TODO: Is this method needed or not?
    Figure findConcreteFigure(Figure.FigureType figureType, Figure.Color color) {
        Figure neededFigure = null;
        for(Figure figure : this.figuresArray) {
            if(figure.getFigureType() == figureType &&
                    figure.getColor() == color  ) {
                neededFigure = figure;
            }
        }
        return neededFigure;
    }

    // ------- To solve task 3 ------------
    boolean thereNoFiguresOnTheWay(Figure figure, Coordinate newCoordinate)
      throws ImpossibleMovementException {
        boolean possibleToMakeSuchMovement = false;
        for(Coordinate coordinate : figure.track(newCoordinate)) {
            if(coordinate == getConcreteFigureCoorditanes(figure)) {
                possibleToMakeSuchMovement = true;
            } else {
                throw new ImpossibleMovementException("There is a figure on the way of your movment");
            }
        }
        return possibleToMakeSuchMovement;
    }

    void moveSomeConcreteFigure(Figure figure, Coordinate newCoordinate)
            throws OccupiedWayException {
        try {
            figure.movement(newCoordinate);
        } catch (OccupiedWayException owe) {
            throw owe;
        }
    }
}
