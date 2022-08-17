/* @author Vlad Zemec (C)2022 */
package test.senla.guide.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException() {}

    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
