package ru.smurtazin.chess.parts;

import ru.smurtazin.chess.figures.Figure;

/**
 * Created by a1 on 09.02.17.
 */
public class ChessBoard {

    public void printAllFiguresSignes() {
        String allFigures =
                " " + "\u2654" + // WHITE CHESS KING
                " " + "\u2655" + // WHITE CHESS QUEEN
                " " + "\u2656" + // WHITE CHESS ROOK
                " " + "\u2657" + // WHITE CHESS BISHOP
                " " + "\u2658" + // WHITE CHESS KNIGHT
                " " + "\u2659" + // WHITE CHESS PAWN
                "\n" +
                " " + "\u265A" + // BLACK CHESS KING
                " " + "\u265B" + // BLACK CHESS QUEEN
                " " + "\u265C" + // BLACK CHESS ROOK
                " " + "\u265D" + // BLACK CHESS BISHOP
                " " + "\u265E" + // BLACK CHESS KNIGHT
                " " + "\u265F"   // BLACK CHESS PAWN
                ;
        System.out.println( allFigures );
    }

    public void printEmptyChessBoard() {
        String topRaw = "                    |";
        String devidingRaw = "    +---+---+---+---+---+---+---+---+";
        String downRaw = "      A   B   C   D | E   F   G   H";

        // TODO: With figers and real chess
        /*for (Figure figure : figuresArray) {
        }*/

        System.out.println(topRaw);
        System.out.println(devidingRaw);
        for(int i = 8; i>0; i--) { // yCoord : up - down
            System.out.printf("  %s |", i);
            for(int j = 0; j<8; j++) { // xCoord : left - right
                // TODO: Use it when doing With figers and real chess
                // System.out.print(" " + figure.figureSign + " |");
                System.out.print("   |");
            }
            System.out.println();
            if(i==4) {
                System.out.println(" ---+---+---+---+---+---+---+---+---+---");
            } else {
                System.out.println(devidingRaw);
            }
        }
        System.out.println(downRaw);
    }

    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();

        chessBoard.printEmptyChessBoard();
        chessBoard.printAllFiguresSignes();
    }
}
