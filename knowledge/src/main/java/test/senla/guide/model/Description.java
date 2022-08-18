/* @author Vlad Zemec (C)2022 */
package test.senla.guide.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Description {

    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    private UUID uuid;

    private String name;

    private String description;

    @ManyToOne private SubTheme subTheme;
}
