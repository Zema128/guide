/* @author Vlad Zemec (C)2022 */
package test.senla.guide.model;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ApproveRecord {

    @Id private UUID uuid;

    private UUID recordToApproveId;
}
