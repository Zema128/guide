/* @author Vlad Zemec (C)2022 */
package test.senla.guide.dto;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DescriptionApproveDto {

    private UUID subThemeUuid;

    private String name;

    private String description;
}
