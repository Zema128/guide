/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import test.senla.guide.dao.MajorThemeDao;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.MajorThemeMapper;
import test.senla.guide.model.MajorTheme;
import test.senla.guide.service.api.MajorThemeService;

@RequiredArgsConstructor
@Service
public class MajorThemeServiceImpl implements MajorThemeService {

    private final MajorThemeMapper mapper;
    private final MajorThemeDao majorThemeDao;

    @Transactional
    @Override
    public MajorThemeDto updateMajorTheme(MajorThemeDto majorThemeDto, UUID majorThemeId) {
        MajorTheme majorTheme = getMajorThemeById(majorThemeId);
        mapper.update(majorTheme, majorThemeDto);
        return mapper.mapToMajorThemeDto(majorTheme);
    }

    @Transactional
    @Override
    public MajorThemeDto createMajorTheme(MajorThemeDto majorThemeDto) {
        return mapper.mapToMajorThemeDto(majorThemeDao.save(mapper.mapToMajorTheme(majorThemeDto)));
    }

    @Override
    public void deleteMajorThemeById(UUID uuid) {
        majorThemeDao.deleteById(uuid);
    }

    @Override
    public MajorThemeDto getMajorThemeByIdDto(UUID uuid) {
        return mapper.mapToMajorThemeDto(getMajorThemeById(uuid));
    }

    @Override
    public MajorTheme getMajorThemeById(UUID uuid) {
        return majorThemeDao
                .findById(uuid)
                .orElseThrow(
                        () ->
                                new EntityNotFoundException(
                                        String.format("No major topic with id '%s'.", uuid)));
    }

    @Override
    public List<MajorThemeDto> getMajorThemes() {
        return mapper.mapToMajorThemeDtos(majorThemeDao.findAll());
    }
}
