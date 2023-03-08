package SogangUniv.DesignProject.Gpt;

import lombok.Getter;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestEditTextDto {
    @NotNull
    @NotEmpty
    private String input;

    @NotNull
    @NotEmpty
    private String instruction;
}
