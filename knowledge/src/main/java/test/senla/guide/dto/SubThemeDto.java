package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SubThemeDto {

    private String name;

    private String description;

    private MainThemeDto mainTheme;

    private List<DescriptionDto> descriptions;
}
