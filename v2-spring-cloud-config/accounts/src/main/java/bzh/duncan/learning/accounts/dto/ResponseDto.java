package bzh.duncan.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;


@Schema(
        name = "Response",
        description = "Schema to hold successful Response Information"
)
@Data @AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code in the response",
            example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status Message in the response",
            example = "Request Processed Successfully"
    )
    private String statusMessage;
}
