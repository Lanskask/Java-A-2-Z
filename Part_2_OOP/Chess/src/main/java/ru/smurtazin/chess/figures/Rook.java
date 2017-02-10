package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class Rook extends Figure {
    public Rook(Color color) {
        super(FigureType.ROOK, color);
    }

    // TODO: I hope I print this method right
    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) {
        ArrayList<Coordinate> trackPointArray = new ArrayList<Coordinate>();
        if  (   // Movement by X :  left - right
                ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0 )
                &&
                ( yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 0 )
            ) {
            for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                i < newCoordinate.xCoordinate.getCoordValue() ;
                i++) {
                Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                        this.nowCoordinate.getXCoordValueToName(i),
                        newCoordinate.yCoordinate
                );
                trackPointArray.add(trackPoint);
            }
        } else {    // Movement by Y :  Up  -or-  Down
            // if moving Up
            if ( this.nowCoordinate.yCoordinate.getCoordValue()  <
                    newCoordinate.yCoordinate.getCoordValue() ) {
                for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                    i < newCoordinate.xCoordinate.getCoordValue() ;
                    i++) {
                    Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                            newCoordinate.xCoordinate,
                            this.nowCoordinate.getYCoordValueToName(i)
                    );
                    trackPointArray.add(trackPoint);
                }
            // if moving Down
            } else {
                for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                    i < newCoordinate.xCoordinate.getCoordValue() ;
                    i++) {
                    Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                            newCoordinate.xCoordinate,
                            this.nowCoordinate.getYCoordValueToName(i)
                    );
                    trackPointArray.add(trackPoint);
                }
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
                                ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0 )
                                &&
                                ( yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 0 )
                            )
                            ||
                            (
                                ( yAbsCoordDiff(this.getNowCoordinate(), newCoordinate) != 0 )
                                &&
                                ( xAbsCoordDiff(this.getNowCoordinate(), newCoordinate) == 0 )
                            )
                        )
            {
                this.setNowCoordinate(newCoordinate);
            } else {
                throw new ImpossibleMovementException("Impossible movement");
            }
        } catch (ImpossibleMovementException ime) {
            throw ime;
        }
    }

}
