package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MajorThemeDto {
    private String name;

    private String description;

    private List<MainThemeDto> mainThemes;
}
