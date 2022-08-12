package test.senla.guide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class DescriptionApprove {

    @Id
    private UUID uuid;

    private UUID subThemeUuid;

    private String name;

    private String description;
}
