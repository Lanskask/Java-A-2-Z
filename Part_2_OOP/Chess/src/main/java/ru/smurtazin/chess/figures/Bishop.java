package ru.smurtazin.chess.figures;

import java.util.ArrayList;

/**
 * Created by a1 on 05.02.17.
 */
public class Bishop extends Figure {
    public Bishop(Color color) {
        super(FigureType.BISHOP, color);
    }

    public ArrayList<Coordinate> way(Coordinate newCoordinate) throws ImpossibleMovementException {
        Coordinate nowCoordinate = this.getNowCoordinate();
        ArrayList<Coordinate> trackPointArray = new ArrayList<Coordinate>();

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
            if ( this.nowCoordinate.yCoordinate.getCoordValue()  < // new > now: goes from down -> up
                    newCoordinate.yCoordinate.getCoordValue() ) {
                for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                    i < newCoordinate.xCoordinate.getCoordValue() ;
                    i++) {
                        Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                            this.nowCoordinate.getXCoordValueToName(i),
                            this.nowCoordinate.getYCoordValueToName(i)
                        );
                        trackPointArray.add(trackPoint);
                }
            } else { // new < now : goes from up -> down
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
        } else {
            throw new ImpossibleMovementException("Impossible movement");
        }
        return trackPointArray;
    }

    @Override
    public ArrayList<Coordinate> track(Coordinate newCoordinate) throws ImpossibleMovementException {
        ArrayList<Coordinate> trackPointArray = new ArrayList<Coordinate>();

        if ( this.nowCoordinate.yCoordinate.getCoordValue()  < // new > now: goes from down -> up
                newCoordinate.yCoordinate.getCoordValue() ) {
            for(int i = this.nowCoordinate.xCoordinate.getCoordValue();
                i < newCoordinate.xCoordinate.getCoordValue() ;
                i++) {
                Coordinate trackPoint = new Coordinate( // Coordinate(xCoordinate, yCoordinate)
                    this.nowCoordinate.getXCoordValueToName(i),
                    this.nowCoordinate.getYCoordValueToName(i)
                );
                trackPointArray.add(trackPoint);
            }
        } else { // new < now : goes from up -> down
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
    public void movement(Coordinate newCoordinate) throws ImpossibleMovementException {
        Coordinate nowCoordinate = this.getNowCoordinate();
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
        } else {
            throw new ImpossibleMovementException("Impossible movement");
        }
    }

}
