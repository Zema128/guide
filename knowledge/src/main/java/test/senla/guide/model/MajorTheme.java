/* @author Vlad Zemec (C)2022 */
package test.senla.guide.model;

import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MajorTheme {

    @Id private UUID uuid;

    private String name;

    private String description;

    @OneToMany(mappedBy = "majorTheme", cascade = CascadeType.ALL)
    private List<MainTheme> mainThemes;
}
