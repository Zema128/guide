package test.senla.guide.model;

import liquibase.pro.packaged.A;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class SubTheme {

    @Id
    private UUID uuid;

    private String name;

    private String description;

    @ManyToOne
    private MainTheme mainTheme;

    @OneToMany(mappedBy = "subTheme", cascade = CascadeType.ALL)
    private List<Description> descriptions;
}
