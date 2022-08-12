package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;
import test.senla.guide.model.MajorTheme;
import test.senla.guide.model.SubTheme;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public class MainThemeDto {
    private String name;

    private String description;

    private List<SubThemeDto> subThemes;

    private MajorThemeDto majorTheme;
}
