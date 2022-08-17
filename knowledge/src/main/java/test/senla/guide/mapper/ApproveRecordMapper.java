/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.model.ApproveRecord;

@Mapper(componentModel = "spring")
public interface ApproveRecordMapper {

    ApproveRecordDto mapToApproveRecordDto(ApproveRecord record);

    ApproveRecord mapToApproveRecord(ApproveRecordDto recordDto);

    List<ApproveRecordDto> mapToApproveRecordDtos(List<ApproveRecord> records);

    List<ApproveRecord> mapToApproveRecords(List<ApproveRecordDto> recordDtos);
}
