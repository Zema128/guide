/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import org.mapstruct.Mapper;
import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.model.ApproveRecord;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ApproveRecordMapper {

    ApproveRecordDto mapToApproveRecordDto(ApproveRecord approveRecord);

    ApproveRecord mapToApproveRecord(ApproveRecordDto recordDto);

    List<ApproveRecordDto> mapToApproveRecordDtos(List<ApproveRecord> records);

    List<ApproveRecord> mapToApproveRecords(List<ApproveRecordDto> recordDtos);
}
