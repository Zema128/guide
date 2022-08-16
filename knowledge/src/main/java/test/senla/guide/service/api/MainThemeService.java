package test.senla.guide.service.api;

import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;

import java.util.List;
import java.util.UUID;

public interface MainThemeService {
    MainThemeDto update(MainTheme subTheme);

    MainThemeDto save(MainTheme subTheme);

    void deleteById(UUID uuid);

    MainThemeDto findById(UUID uuid);

    List<MainThemeDto> findAll();
}
