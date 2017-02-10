package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 23.01.17.
 */
public class Coordinate {

    public enum XCoordinate {
        A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);

        private int xCoordValue;

        XCoordinate(int val) { xCoordValue = val; }

        int getCoordValue() { return xCoordValue; } // name to value

        // TODO: I'm not sure that it works
        public XCoordinate getValueToName(int value) { // value to name
            for(XCoordinate e : XCoordinate.values()){
                if(value == e.getCoordValue()) return e;
            }
            return null;
        }
    }

    public enum YCoordinate {
        _1(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8);

        private int yCoordValue;
        YCoordinate(int val) { yCoordValue = val; }
        int getCoordValue() { return yCoordValue; }

        public XCoordinate getValueToName(int value) { // value to name
            for(XCoordinate e : XCoordinate.values()){
                if(value == e.getCoordValue()) return e;
            }
            return null;
        }
    }

    XCoordinate xCoordinate;
    YCoordinate yCoordinate;

    public Coordinate(XCoordinate xCoordinate, YCoordinate yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Coordinate() {}

    public XCoordinate getXCoordValueToName(int value) { // value to name
        for(XCoordinate e : XCoordinate.values()){
            if(value == e.getCoordValue()) return e;
        }
        return null;
    }

    public YCoordinate getYCoordValueToName(int value) { // value to name
        for(YCoordinate e : YCoordinate.values()){
            if(value == e.getCoordValue()) return e;
        }
        return null;
    }

    // TODO: ?
//    public Coordinate() {}

/*    // TODO: ?
    Coordinate getCoordinatesNamesByValue(int xCoordValue, int yCoordValue) {
        // point.getCoordinatesNamesByValue(4, 5) -> Coordinate point
        Coordinate pointCoordinates = new Coordinate();

        return pointCoordinates; // .(xCoordinate, yCoordinate)
    }*/
}
