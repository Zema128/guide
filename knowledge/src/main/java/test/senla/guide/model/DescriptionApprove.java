/* @author Vlad Zemec (C)2022 */
package test.senla.guide.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DescriptionApprove {

    @Id
    @GeneratedValue(generator = "UUID_GENERATOR")
    private UUID uuid;

    private UUID subThemeUuid;

    private String name;

    private String description;
}
