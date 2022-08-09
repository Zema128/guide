package test.senla.guide.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class MajorTheme {

    @Id
    private UUID uuid;

    private String name;

    private String description;

    @OneToMany(mappedBy = "majorTheme", cascade = CascadeType.ALL)
    private List<MainTheme> mainThemes;
}
