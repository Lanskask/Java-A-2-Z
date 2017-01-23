package ru.smurtazin.chess.parts;

/**
 * Created by a1 on 23.01.17.
 */
public class Coordinate {
    enum XCoordinate {
        A, B, C, D, E, F, G, H
    }

    enum YCoordinate {
        _1, _2, _3, _4, _5, _6, _7, _8
    };

    //    String x;
    int x;
    int y;

    XCoordinate xCoordinate;
    YCoordinate yCoordinate;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Coordinate(XCoordinate xCoordinate, YCoordinate yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
}
