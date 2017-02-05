package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 23.01.17.
 */
public class Coordinate {
    public enum XCoordinate {
        A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);

        private int xCoordValue;
        XCoordinate(int val) { xCoordValue = val;}
        int getCoordValue() {return xCoordValue;}
    }

    public enum YCoordinate {
        _1(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8);

        private int yCoordValue;
        YCoordinate(int val) { yCoordValue = val;}
        int getCoordValue() {return yCoordValue;}
    };

    XCoordinate xCoordinate;
    YCoordinate yCoordinate;

//    Coordinate(XCoordinate xCoordinate, YCoordinate yCoordinate);     // Constructor for Coordinate
    Coordinate(XCoordinate xCoordinate, YCoordinate yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    /*//    String x;
    int x;
    int y;
    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }*/
}
