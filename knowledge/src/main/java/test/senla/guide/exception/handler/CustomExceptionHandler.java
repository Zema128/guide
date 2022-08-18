/* @author Vlad Zemec (C)2022 */
package test.senla.guide.exception.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import test.senla.guide.dto.ApiError;
import test.senla.guide.exception.EntityNotFoundException;

@ControllerAdvice
@Slf4j
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({Exception.class})
    public ResponseEntity<ApiError> handleAll(Exception ex) {
        ApiError apiError =
                new ApiError(
                        HttpStatus.INTERNAL_SERVER_ERROR,
                        ex.getLocalizedMessage(),
                        "error occurred");
        log.error(ex.getLocalizedMessage(), ex);
        return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
    }

    @ExceptionHandler({EntityNotFoundException.class})
    public ResponseEntity<ApiError> handleEntityNotFound(EntityNotFoundException ex) {
        ApiError apiError =
                new ApiError(
                        HttpStatus.INTERNAL_SERVER_ERROR,
                        ex.getLocalizedMessage(),
                        "Entity not found!");
        log.error(ex.getLocalizedMessage(), ex);
        return new ResponseEntity<>(apiError, new HttpHeaders(), apiError.getStatus());
    }
}
