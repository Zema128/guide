/* @author Vlad Zemec (C)2022 */
package test.senla.guide.dto;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainThemeDto {
    private String name;

    private String description;

    private List<SubThemeDto> subThemes;

    private MajorThemeDto majorTheme;
}
