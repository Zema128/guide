/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.senla.guide.dao.SubThemeDao;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.SubThemeMapper;
import test.senla.guide.model.MainTheme;
import test.senla.guide.model.SubTheme;
import test.senla.guide.service.api.MainThemeService;
import test.senla.guide.service.api.SubThemeService;

@RequiredArgsConstructor
@Service
public class SubThemeServiceImpl implements SubThemeService {

    private final SubThemeMapper mapper;
    private final SubThemeDao subThemeDao;
    private final MainThemeService mainThemeService;

    @Transactional
    @Override
    public SubThemeDto updateSubTheme(UUID subId, SubThemeDto subThemeDto) {
        SubTheme subTheme = getSubThemeById(subId);
        mapper.update(subTheme, subThemeDto);
        return mapper.mapToSubThemeDto(subTheme);
    }

    @Transactional
    @Override
    public SubThemeDto createSubTheme(UUID mainId, SubThemeDto subThemeDto) {
        MainTheme mainTheme = mainThemeService.getMainThemeById(mainId);
        SubTheme subTheme = mapper.mapToSubTheme(subThemeDto);
        subTheme.setMainTheme(mainTheme);
        return mapper.mapToSubThemeDto(subThemeDao.save(subTheme));
    }

    @Override
    public void deleteSubThemeById(UUID uuid) {
        subThemeDao.deleteById(uuid);
    }

    @Override
    public SubThemeDto getSubThemeByIdDto(UUID uuid) {
        return mapper.mapToSubThemeDto(getSubThemeById(uuid));
    }

    @Override
    public SubTheme getSubThemeById(UUID uuid) {
        return subThemeDao
                .findById(uuid)
                .orElseThrow(
                        () ->
                                new EntityNotFoundException(
                                        String.format("No subtopic with id '%s'.", uuid)));
    }

    @Override
    public List<SubThemeDto> getSubThemes() {
        return mapper.mapToSubThemeDtos(subThemeDao.findAll());
    }
}
