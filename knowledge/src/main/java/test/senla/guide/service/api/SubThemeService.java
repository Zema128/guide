package test.senla.guide.service.api;

import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;

import java.util.List;
import java.util.UUID;

public interface SubThemeService {

    SubThemeDto update(SubTheme subTheme);

    SubThemeDto save(SubTheme subTheme);

    void deleteById(UUID uuid);

    SubThemeDto findById(UUID uuid);

    List<SubThemeDto> findAll();

}
