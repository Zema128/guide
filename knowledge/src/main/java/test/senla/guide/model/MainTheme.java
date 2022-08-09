package test.senla.guide.model;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class MainTheme {

    @Id
    private UUID uuid;

    private String name;

    private String description;

    @OneToMany(mappedBy = "mainTheme", cascade = CascadeType.ALL)
    private List<SubTheme> subThemes;

    @ManyToOne
    private MajorTheme majorTheme;
}
