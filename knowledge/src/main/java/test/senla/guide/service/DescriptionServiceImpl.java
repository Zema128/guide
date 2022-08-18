/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.senla.guide.dao.DescriptionDao;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.DescriptionMapper;
import test.senla.guide.model.Description;
import test.senla.guide.model.SubTheme;
import test.senla.guide.service.api.DescriptionService;
import test.senla.guide.service.api.SubThemeService;

@RequiredArgsConstructor
@Service
public class DescriptionServiceImpl implements DescriptionService {

    private final DescriptionMapper mapper;
    private final DescriptionDao descriptionDao;
    private final SubThemeService subThemeService;

    @Transactional
    @Override
    public DescriptionDto updateDescription(UUID descriptionId, DescriptionDto descriptionDto) {
        Description description = getDescriptionById(descriptionId);
        mapper.update(description, descriptionDto);
        return mapper.mapToDescriptionDto(description);
    }

    @Transactional
    @Override
    public DescriptionDto createDescription(UUID subId, DescriptionDto descriptionDto) {
        SubTheme subTheme = subThemeService.getSubThemeById(subId);
        Description description = mapper.mapToDescription(descriptionDto);
        description.setSubTheme(subTheme);
        return mapper.mapToDescriptionDto(descriptionDao.save(description));
    }

    @Override
    public void deleteDescriptionById(UUID uuid) {
        descriptionDao.deleteById(uuid);
    }

    @Override
    public DescriptionDto getDescriptionByIdDto(UUID uuid) {
        return mapper.mapToDescriptionDto(getDescriptionById(uuid));
    }

    @Override
    public Description getDescriptionById(UUID uuid) {
        return descriptionDao
                .findById(uuid)
                .orElseThrow(
                        () ->
                                new EntityNotFoundException(
                                        String.format("No description with id '%s'.", uuid)));
    }

    @Override
    public List<DescriptionDto> getDescriptions() {
        return mapper.mapToDescriptionDtos(descriptionDao.findAll());
    }
}
