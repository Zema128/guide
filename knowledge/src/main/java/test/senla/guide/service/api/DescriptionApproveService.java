package test.senla.guide.service.api;

import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.model.ApproveRecord;
import test.senla.guide.model.DescriptionApprove;

import java.util.List;
import java.util.UUID;

public interface DescriptionApproveService {
    DescriptionApproveDto update(DescriptionApprove approveRecord);

    DescriptionApproveDto save(DescriptionApprove approveRecord);

    void deleteById(UUID uuid);

    DescriptionApproveDto findById(UUID uuid);

    List<DescriptionApproveDto> findAll();
}
