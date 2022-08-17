/* @author Vlad Zemec (C)2022 */
package test.senla.guide.model;

import java.util.List;
import java.util.UUID;
import javax.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MainTheme {

    @Id private UUID uuid;

    private String name;

    private String description;

    @OneToMany(mappedBy = "mainTheme", cascade = CascadeType.ALL)
    private List<SubTheme> subThemes;

    @ManyToOne private MajorTheme majorTheme;
}
