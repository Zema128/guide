package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.model.ApproveRecord;
import test.senla.guide.service.api.ApproveRecordService;

import java.util.List;
import java.util.UUID;

@Service
public class ApproveRecordServiceImpl implements ApproveRecordService {
    @Override
    public ApproveRecordDto update(ApproveRecord approveRecord) {
        return null;
    }

    @Override
    public ApproveRecordDto save(ApproveRecord approveRecord) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public ApproveRecordDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<ApproveRecordDto> findAll() {
        return null;
    }
}
