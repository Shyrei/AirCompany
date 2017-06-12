package by.shyrei.aircompany.exception;

/**
 * Project AirCompany
 * Created on 12.06.2017.
 * author Shyrei Uladzimir
 */
public class InitializationException extends Exception{

    public InitializationException() {
    }

    public InitializationException(String msg) {
        super(msg);
    }

    public InitializationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public InitializationException(Throwable cause) {
        super(cause);
    }
}