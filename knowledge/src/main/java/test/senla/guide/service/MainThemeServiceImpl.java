/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.senla.guide.dao.MainThemeDao;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.MainThemeMapper;
import test.senla.guide.model.MainTheme;
import test.senla.guide.model.MajorTheme;
import test.senla.guide.service.api.MainThemeService;
import test.senla.guide.service.api.MajorThemeService;

@RequiredArgsConstructor
@Service
public class MainThemeServiceImpl implements MainThemeService {

    private final MainThemeMapper mapper;
    private final MainThemeDao mainThemeDao;
    private final MajorThemeService majorThemeService;

    @Transactional
    @Override
    public MainThemeDto updateMainTheme(UUID mainId, MainThemeDto mainThemeDto) {
        MainTheme mainTheme = getMainThemeById(mainId);
        mapper.update(mainTheme, mainThemeDto);
        return mapper.mapToMainThemeDto(mainTheme);
    }

    @Transactional
    @Override
    public MainThemeDto createMainTheme(UUID majorId, MainThemeDto mainThemeDto) {
        MajorTheme majorTheme = majorThemeService.getMajorThemeById(majorId);
        MainTheme mainTheme = mapper.mapToMainTheme(mainThemeDto);
        mainTheme.setMajorTheme(majorTheme);
        return mapper.mapToMainThemeDto(mainThemeDao.save(mainTheme));
    }

    @Override
    public void deleteMainThemeById(UUID uuid) {
        mainThemeDao.deleteById(uuid);
    }

    @Override
    public MainThemeDto getMainThemeDto(UUID mainId) {
        return mapper.mapToMainThemeDto(getMainThemeById(mainId));
    }

    @Override
    public MainTheme getMainThemeById(UUID uuid) {
        return mainThemeDao
                .findById(uuid)
                .orElseThrow(
                        () ->
                                new EntityNotFoundException(
                                        String.format("No Main topic with id '%s'.", uuid)));
    }

    @Override
    public List<MainThemeDto> getMainThemes() {
        return mapper.mapToMainThemeDtos(mainThemeDao.findAll());
    }
}
