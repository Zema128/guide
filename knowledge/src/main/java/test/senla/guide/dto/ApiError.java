/* @author Vlad Zemec (C)2022 */
package test.senla.guide.dto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
public class ApiError {

    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus status, String message, List<String> errors) {
        super();
        this.status = status;
        this.message = message;
        this.errors = errors;
    }

    public ApiError(HttpStatus status, String message, String error) {
        super();
        this.status = status;
        this.message = message;
        this.errors = Arrays.asList(error);
    }

    public ApiError(HttpStatus status, String message) {
        super();
        this.status = status;
        this.message = message;
        this.errors = Collections.emptyList();
    }
}
