package se1app.exception;

/**
 * Created by MattX7 on 08.11.2016.
 */
public class TechnicalProblemException extends Exception {
    public TechnicalProblemException() {
        super("A technical problem occurred");
    }

    public TechnicalProblemException(String s) {
        super(s);
    }
}
