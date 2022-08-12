package test.senla.guide.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class ApproveRecord {

    @Id
    private UUID uuid;

    private UUID recordToApproveId;
}
