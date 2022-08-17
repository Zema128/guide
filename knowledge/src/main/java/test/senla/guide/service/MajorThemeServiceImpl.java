/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
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

    @Override
    public MajorThemeDto update(MajorTheme subTheme) {
        return null;
    }

    @Override
    public MajorThemeDto save(MajorTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        majorThemeDao.deleteById(uuid);
    }

    @Override
    public MajorThemeDto findById(UUID uuid) {
        return mapper.mapToMajorThemeDto(
                majorThemeDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format(
                                                        "No major topic with id '%s'.", uuid))));
    }

    @Override
    public List<MajorThemeDto> findAll() {
        return mapper.mapToMajorThemeDtos(majorThemeDao.findAll());
    }
}
