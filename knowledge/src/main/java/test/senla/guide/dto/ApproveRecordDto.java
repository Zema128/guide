package test.senla.guide.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class ApproveRecordDto {

    private UUID recordToApproveId;
}
