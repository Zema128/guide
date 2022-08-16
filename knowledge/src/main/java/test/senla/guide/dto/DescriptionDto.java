package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DescriptionDto {

    private String name;

    private String description;

    private SubThemeDto subTheme;
}
