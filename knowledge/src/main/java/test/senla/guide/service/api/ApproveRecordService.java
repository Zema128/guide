package test.senla.guide.service.api;

import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.model.ApproveRecord;
import test.senla.guide.model.SubTheme;

import java.util.List;
import java.util.UUID;

public interface ApproveRecordService {
    ApproveRecordDto update(ApproveRecord approveRecord);

    ApproveRecordDto save(ApproveRecord approveRecord);

    void deleteById(UUID uuid);

    ApproveRecordDto findById(UUID uuid);

    List<ApproveRecordDto> findAll();
}
