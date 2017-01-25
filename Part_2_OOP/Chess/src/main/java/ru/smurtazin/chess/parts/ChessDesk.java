package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
public class ChessDesk {

    String[] XCoordinate = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int[] YCoordinate = {1, 2, 3, 4, 5, 6, 7, 8};

    Figure[] figuresArray = new Figure[32];
    int position = 0;

    public void fillFiguresArray() {
        this.figuresArray[position++] = this.whiteKing;
        this.figuresArray[position++] = this.blackKing;
        this.figuresArray[position++] = this.whiteQueen;
        this.figuresArray[position++] = this.blackQueen;

    }

    Figure whiteKing = new Figure(Figure.FigureType.KING, Figure.Color.WHITE) {
        @Override
        public void movement(Coordinate newCoordinate) {
            Coordinate nowCoordinate = whiteKing.getNowCoordinate();
            if (nowCoordinate  == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if ( (Math.abs(newCoordinate.xCoordinate.getCoordValue()
                            - nowCoordinate.xCoordinate.getCoordValue()) == 1 ) ||
                    ( Math.abs(newCoordinate.yCoordinate.getCoordValue()
                            - nowCoordinate.yCoordinate.getCoordValue()) == 1)  ) {
                this.setNowCoordinate(newCoordinate);
            }
        }
    };

    Figures whiteKing1 = new Figures.King();



}
