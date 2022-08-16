package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MainThemeDto {
    private String name;

    private String description;

    private List<SubThemeDto> subThemes;

    private MajorThemeDto majorTheme;
}
