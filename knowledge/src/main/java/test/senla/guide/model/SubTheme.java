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
public class SubTheme {

    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    private UUID uuid;

    private String name;

    private String description;

    @ManyToOne private MainTheme mainTheme;

    @OneToMany(mappedBy = "subTheme", cascade = CascadeType.ALL)
    private List<Description> descriptions;
}
