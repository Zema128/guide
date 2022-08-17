/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.senla.guide.dao.SubThemeDao;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.SubThemeMapper;
import test.senla.guide.model.SubTheme;
import test.senla.guide.service.api.SubThemeService;

@RequiredArgsConstructor
@Service
public class SubThemeServiceImpl implements SubThemeService {

    private final SubThemeMapper mapper;
    private final SubThemeDao subThemeDao;

    @Override
    public SubThemeDto update(SubTheme subTheme) {
        return null;
    }

    @Override
    public SubThemeDto save(SubTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        subThemeDao.deleteById(uuid);
    }

    @Override
    public SubThemeDto findById(UUID uuid) {
        return mapper.mapToSubThemeDto(
                subThemeDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format("No subtopic with id '%s'.", uuid))));
    }

    @Override
    public List<SubThemeDto> findAll() {
        return mapper.mapToSubThemeDtos(subThemeDao.findAll());
    }
}
