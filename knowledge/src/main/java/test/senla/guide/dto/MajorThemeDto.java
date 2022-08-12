package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;
import test.senla.guide.model.MainTheme;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public class MajorThemeDto {
    private String name;

    private String description;

    private List<MainThemeDto> mainThemes;
}
