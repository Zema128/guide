package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;
import test.senla.guide.model.SubTheme;

import javax.persistence.ManyToOne;

@Getter
@Setter
public class DescriptionDto {

    private String name;

    private String description;

    private SubThemeDto subTheme;
}
