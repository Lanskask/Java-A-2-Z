package ru.smurtazin.chess.figures;

/**
 * Created by a1 on 06.02.17.
 */
public class ImpossibleMovementException extends RuntimeException {

    public ImpossibleMovementException(String msg) {
        super(msg);
    }

}
