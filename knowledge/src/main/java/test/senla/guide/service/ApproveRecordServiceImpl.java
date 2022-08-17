/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.senla.guide.dao.ApproveRecordDao;
import test.senla.guide.dto.ApproveRecordDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.ApproveRecordMapper;
import test.senla.guide.model.ApproveRecord;
import test.senla.guide.service.api.ApproveRecordService;

@RequiredArgsConstructor
@Service
public class ApproveRecordServiceImpl implements ApproveRecordService {

    private final ApproveRecordMapper mapper;
    private final ApproveRecordDao approveRecordDao;

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
        approveRecordDao.deleteById(uuid);
    }

    @Override
    public ApproveRecordDto findById(UUID uuid) {
        return mapper.mapToApproveRecordDto(
                approveRecordDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format(
                                                        "No description with id '%s'.", uuid))));
    }

    @Override
    public List<ApproveRecordDto> findAll() {
        return mapper.mapToApproveRecordDtos(approveRecordDao.findAll());
    }
}
