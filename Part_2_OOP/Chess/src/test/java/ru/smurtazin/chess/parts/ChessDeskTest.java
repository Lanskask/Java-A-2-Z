package ru.smurtazin.chess.parts;

import org.junit.Before;
import org.junit.Test;
import ru.smurtazin.chess.figures.*;

import static org.junit.Assert.*;

/**
 * Created by a1 on 10.02.17.
 */
public class ChessDeskTest {

    ChessDesk chessDesk;

    @Before
    public void init() {
        this.chessDesk = new ChessDesk();
    }

    @Test(expected=OccupiedWayException.class)
    public void moveSomeConcreteFigure() throws Exception {
        Bishop bishop = new Bishop(Figure.Color.BLACK);
        Rook rook = new Rook(Figure.Color.BLACK);

//        c_3 - rook
//        d_2 - bishop
        bishop.setNowCoordinate(
                new Coordinate(Coordinate.XCoordinate.D, Coordinate.YCoordinate._2)
        );

        rook.setNowCoordinate(
                new Coordinate(Coordinate.XCoordinate.C, Coordinate.YCoordinate._3)
        );

        // b_4 - new place for bishop
        this.chessDesk.moveSomeConcreteFigure(bishop,
                new Coordinate(Coordinate.XCoordinate.B, Coordinate.YCoordinate._4)
        );
    }

}