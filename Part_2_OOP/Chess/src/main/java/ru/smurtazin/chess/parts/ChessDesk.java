package ru.smurtazin.chess.parts;

import java.util.ArrayList;

/**
 * Created by a1 on 23.01.17.
 */
public class ChessDesk {

    Figures figures;

    public ChessDesk() {
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

    Figures.King whiteKing = figures.new King(Figure.Color.WHITE);
    Figures.King blackKing = figures.new King(Figure.Color.BLACK);

    Figures.Queen whiteQueen = figures.new Queen(Figure.Color.WHITE);
    Figures.Queen blackQueen = figures.new Queen(Figure.Color.BLACK);

    Figures.Rook whiteRook = figures.new Rook(Figure.Color.WHITE);
    Figures.Rook blackRook = figures.new Rook(Figure.Color.BLACK);

    Figures.Knight whiteKnight = figures.new Knight(Figure.Color.WHITE);
    Figures.Knight blackKnight = figures.new Knight(Figure.Color.BLACK);

    Figures.Bishop whiteBishop = figures.new Bishop(Figure.Color.WHITE);
    Figures.Bishop blackBishop = figures.new Bishop(Figure.Color.BLACK);


    void makeWhitePawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.whitePawns.add(figures.new WhitePawn(xCoordinate));
        }
    }

    void makeBlackPawnsArray() {
        for (Coordinate.XCoordinate xCoordinate : Coordinate.XCoordinate.values()) {
            this.blackPawns.add(figures.new BlackPawn(xCoordinate));
        }
    }

}
