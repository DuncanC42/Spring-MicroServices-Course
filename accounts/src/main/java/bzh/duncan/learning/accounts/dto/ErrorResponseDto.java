package bzh.duncan.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold Error Response Information"
)
@Data @AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API Path invoked the error"
    )
    private String apiPath;

    @Schema(
            description = "HTTP Status Code in the error response"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message representing the error occurred"
    )
    private String errorMessage;

    @Schema(
            description = "Time when the error occurred"
    )
    private LocalDateTime errorTime;
}
