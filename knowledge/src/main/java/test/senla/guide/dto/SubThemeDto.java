/* @author Vlad Zemec (C)2022 */
package test.senla.guide.dto;

import java.util.List;
import javax.validation.constraints.Null;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubThemeDto {

    private String name;

    private String description;

    @Null private List<DescriptionDto> descriptions;
}
