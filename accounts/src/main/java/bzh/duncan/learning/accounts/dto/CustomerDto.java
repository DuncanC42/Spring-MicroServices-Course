package bzh.duncan.learning.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Singular;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            name = "Name of the Customer",
            example = "Eazy Bytes"
    )
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The name of the customer should be between 5 and 30")
    private String name;


    @Schema(
            name = "Email address of the Customer",
            example = "eazy.bytes@bank.com"
    )
    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email format is incorrect")
    private String email;

    @Schema(
            name = "Mobile number of the Customer",
            example = "9876543210"
    )
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;
    private AccountsDto accountsDto;
}
