package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;
import test.senla.guide.model.Description;
import test.senla.guide.model.MainTheme;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
public class SubThemeDto {

    private String name;

    private String description;

    private MainThemeDto mainTheme;

    private List<DescriptionDto> descriptions;
}
