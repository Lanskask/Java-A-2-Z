package ru.smurtazin.chess.figures;

import org.junit.Test;

/**
 * Created by a1 on 10.02.17.
 */
public class BishopTest {

    @Test(expected=ImpossibleMovementException.class)
    public void movement() throws Exception {
        Bishop bishop = new Bishop(Figure.Color.WHITE);

        bishop.movement(
                new Coordinate( Coordinate.XCoordinate.E, Coordinate.YCoordinate._3 )
        );
    }

}