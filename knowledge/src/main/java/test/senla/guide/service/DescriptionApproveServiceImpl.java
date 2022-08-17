/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.senla.guide.dao.DescriptionApproveDao;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.DescriptionApproveMapper;
import test.senla.guide.model.DescriptionApprove;
import test.senla.guide.service.api.DescriptionApproveService;

@RequiredArgsConstructor
@Service
public class DescriptionApproveServiceImpl implements DescriptionApproveService {

    private final DescriptionApproveMapper mapper;
    private final DescriptionApproveDao descriptionApproveDao;

    @Override
    public DescriptionApproveDto update(DescriptionApprove approveRecord) {
        return null;
    }

    @Override
    public DescriptionApproveDto save(DescriptionApprove approveRecord) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        descriptionApproveDao.deleteById(uuid);
    }

    @Override
    public DescriptionApproveDto findById(UUID uuid) {
        return mapper.mapToDescriptionApproveDto(
                descriptionApproveDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format(
                                                        "No description with id '%s'.", uuid))));
    }

    @Override
    public List<DescriptionApproveDto> findAll() {
        return mapper.mapToDescriptionApproveDtos(descriptionApproveDao.findAll());
    }
}
