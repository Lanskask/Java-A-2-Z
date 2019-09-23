package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 06.02.17.
 */
public class OccupiedWayException extends RuntimeException {

    public OccupiedWayException(String msg) {
        super(msg);
    }

}
