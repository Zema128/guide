package test.senla.guide.service.api;

import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.MajorTheme;
import test.senla.guide.model.SubTheme;

import java.util.List;
import java.util.UUID;

public interface MajorThemeService {

    MajorThemeDto update(MajorTheme subTheme);

    MajorThemeDto save(MajorTheme subTheme);

    void deleteById(UUID uuid);

    MajorThemeDto findById(UUID uuid);

    List<MajorThemeDto> findAll();
}
