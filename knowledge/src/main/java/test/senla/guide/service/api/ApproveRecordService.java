/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.model.ApproveRecord;

public interface ApproveRecordService {
    ApproveRecordDto update(ApproveRecord approveRecord);

    ApproveRecordDto save(ApproveRecord approveRecord);

    void deleteById(UUID uuid);

    ApproveRecordDto findById(UUID uuid);

    List<ApproveRecordDto> findAll();
}
