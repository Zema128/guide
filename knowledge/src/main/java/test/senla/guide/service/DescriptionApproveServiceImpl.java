/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.senla.guide.dao.DescriptionApproveDao;
import test.senla.guide.dao.DescriptionDao;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.dto.FinishedDescriptionDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.DescriptionApproveMapper;
import test.senla.guide.model.Description;
import test.senla.guide.model.DescriptionApprove;
import test.senla.guide.model.SubTheme;
import test.senla.guide.service.api.DescriptionApproveService;
import test.senla.guide.service.api.SubThemeService;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class DescriptionApproveServiceImpl implements DescriptionApproveService {

    private final DescriptionApproveMapper mapper;
    private final DescriptionApproveDao descriptionApproveDao;
    private final DescriptionDao descriptionDao;
    private final SubThemeService subThemeService;

    @Transactional
    @Override
    public DescriptionApproveDto updateDescriptionApprove(
            UUID approveId, DescriptionApproveDto approveDto) {
        DescriptionApprove descriptionApprove = getDescriptionApproveById(approveId);
        mapper.update(descriptionApprove, approveDto);
        return mapper.mapToDescriptionApproveDto(descriptionApprove);
    }

    @Transactional
    @Override
    public void saveDescription(FinishedDescriptionDto descriptionDto) {
        DescriptionApprove descriptionApprove =
                getDescriptionApproveById(descriptionDto.getDescriptionId());
        SubTheme subTheme = subThemeService.getSubThemeById(descriptionApprove.getSubThemeUuid());
        Description descriptionToSave =
                Description.builder()
                        .description(descriptionApprove.getDescription())
                        .name(descriptionApprove.getName())
                        .subTheme(subTheme)
                        .build();
        descriptionDao.save(descriptionToSave);
        descriptionApproveDao.deleteById(descriptionApprove.getUuid());
    }

    @Transactional
    @Override
    public DescriptionApproveDto createDescriptionApprove(DescriptionApproveDto approveDto) {
        DescriptionApprove approve = mapper.mapToDescriptionApprove(approveDto);
        return mapper.mapToDescriptionApproveDto(descriptionApproveDao.save(approve));
    }

    @Override
    public void deleteDescriptionApproveById(UUID uuid) {
        descriptionApproveDao.deleteById(uuid);
    }

    @Override
    public DescriptionApproveDto getDescriptionApproveByIdDto(UUID uuid) {
        return mapper.mapToDescriptionApproveDto(getDescriptionApproveById(uuid));
    }

    @Override
    public DescriptionApprove getDescriptionApproveById(UUID uuid) {
        return descriptionApproveDao
                .findById(uuid)
                .orElseThrow(
                        () ->
                                new EntityNotFoundException(
                                        String.format(
                                                "No description to approve with id '%s'.", uuid)));
    }

    @Override
    public List<DescriptionApproveDto> getDescriptionApproves() {
        return mapper.mapToDescriptionApproveDtos(descriptionApproveDao.findAll());
    }
}
