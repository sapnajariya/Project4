package in.co.sunrays.project4.exception;

/**
 * DuplicateRecordException is thrown when a duplicate record occurs.
 * @author SAPNA
 *
 */
public class DuplicateRecordException extends Exception {

    /**
     * error message
     */
    public DuplicateRecordException(String msg) {
        super(msg);
    }

}

