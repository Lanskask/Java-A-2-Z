package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class Bishop extends Figure {
    public Bishop(Color color) {
        super(FigureType.BISHOP, color);
    }

    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) {
        ArrayList<Coordinate> trackPointArray = new ArrayList<Coordinate>();
        if ( this.nowCoordinate.yCoordinate.getCoordValue()  <
                newCoordinate.yCoordinate.getCoordValue() ) {
            for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                i < newCoordinate.xCoordinate.getCoordValue() ;
                i++) {
                // TODO: I'm not sure it sould be like this
                // TODO: I thought it should be like:
                // TODO:    Coordinate.getYCoordValueToName(i)
                // TODO: or like this
                // TODO: trackPoint.yCoordinate.getValueToName(i)
                Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                    this.nowCoordinate.getXCoordValueToName(i),
                    this.nowCoordinate.getYCoordValueToName(i)
                );
                trackPointArray.add(trackPoint);
            }
        } else {
            for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                i < newCoordinate.xCoordinate.getCoordValue() ;
                i--) {
                Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                    this.nowCoordinate.getXCoordValueToName(i),
                    this.nowCoordinate.getYCoordValueToName(i)
                );
                trackPointArray.add(trackPoint);
            }
        }
        return trackPointArray;
    }

    @Override
    public void movement(Coordinate newCoordinate) {
        Coordinate nowCoordinate = this.getNowCoordinate(); // TODO: What this points to?
        try {
            if (nowCoordinate == newCoordinate) {
                System.out.println("You place your figure on the same place");
            } else if   (
                            (
                                xAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                                ==
                                yAbsCoordDiff(this.getNowCoordinate(), newCoordinate)
                            )
                        )
            {
                this.setNowCoordinate(newCoordinate);
            }
        } catch (ImpossibleMovementException ime) {
            throw ime;
        }
    }
}
