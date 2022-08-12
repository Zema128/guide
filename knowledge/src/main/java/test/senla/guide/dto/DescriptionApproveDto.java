package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class DescriptionApproveDto {

    private UUID subThemeUuid;

    private String name;

    private String description;
}
