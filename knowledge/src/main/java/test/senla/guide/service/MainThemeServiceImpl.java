/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.senla.guide.dao.MainThemeDao;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.MainThemeMapper;
import test.senla.guide.model.MainTheme;
import test.senla.guide.service.api.MainThemeService;

@RequiredArgsConstructor
@Service
public class MainThemeServiceImpl implements MainThemeService {

    private final MainThemeMapper mapper;
    private final MainThemeDao mainThemeDao;

    @Override
    public MainThemeDto update(MainTheme subTheme) {
        return null;
    }

    @Override
    public MainThemeDto save(MainTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        mainThemeDao.deleteById(uuid);
    }

    @Override
    public MainThemeDto findById(UUID uuid) {
        return mapper.mapToMainThemeDto(
                mainThemeDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format(
                                                        "No Main topic with id '%s'.", uuid))));
    }

    @Override
    public List<MainThemeDto> findAll() {
        return mapper.mapToMainThemeDtos(mainThemeDao.findAll());
    }
}
