package test.senla.guide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.UUID;

@Entity
public class Description {

    @Id
    private UUID uuid;

    private String name;

    private String description;

    @ManyToOne
    private SubTheme subTheme;
}
