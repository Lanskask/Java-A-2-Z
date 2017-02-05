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
        this.whiteKing.setColor(Figure.Color.WHITE);
        figuresArray.add(this.whiteKing);
        this.blackKing.setColor(Figure.Color.BLACK);
        figuresArray.add(this.blackKing);

        this.whiteQueen.setColor(Figure.Color.WHITE);
        figuresArray.add(this.whiteQueen);
        this.blackQueen.setColor(Figure.Color.BLACK);
        figuresArray.add(this.blackQueen);

        this.whiteRook.setColor(Figure.Color.WHITE);
        figuresArray.add(this.whiteRook);
        this.blackRook.setColor(Figure.Color.BLACK);
        figuresArray.add(this.blackRook);

        this.whiteKnight.setColor(Figure.Color.WHITE);
        figuresArray.add(this.whiteKnight);
        this.blackKnight.setColor(Figure.Color.BLACK);
        figuresArray.add(this.blackKnight);

        this.whiteBishop.setColor(Figure.Color.WHITE);
        figuresArray.add(this.whiteBishop);
        this.blackBishop.setColor(Figure.Color.BLACK);
        figuresArray.add(this.blackBishop);

        // TODO: Is it right or not?:
        // TODO:    Does function addAll add array to the
        // TODO:        end of the first array, means concatenate two arrays?
        this.makeWhitePawnsArray();
        this.makeBlackPawnsArray();
        figuresArray.addAll(whitePawns);
        figuresArray.addAll(blackPawns);
    }

//    King whiteKing = new King(Figure.Color.WHITE);
    King whiteKing = new King();
    King blackKing = new King();

    Queen whiteQueen = new Queen();
    Queen blackQueen = new Queen();

    Rook whiteRook = new Rook();
    Rook blackRook = new Rook();

    Knight whiteKnight = new Knight(Figure.Color.WHITE);
    Knight blackKnight = new Knight();

    Bishop whiteBishop = new Bishop();
    Bishop blackBishop = new Bishop();

    void makeWhitePawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.whitePawns.add(new WhitePawn().setInitialXCoordinatePaw(xCoordinate));
        }
    }

    void makeBlackPawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
//            this.blackPawns.add(new BlackPawn(xCoordinate)); // Previous variant
            this.blackPawns.add(new BlackPawn().setInitialXCoordinatePaw(xCoordinate));
        }
    }

}
