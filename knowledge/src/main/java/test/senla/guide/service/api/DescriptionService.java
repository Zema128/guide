package test.senla.guide.service.api;

import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.Description;
import test.senla.guide.model.SubTheme;

import java.util.List;
import java.util.UUID;

public interface DescriptionService {

    DescriptionDto update(Description description);

    DescriptionDto save(Description description);

    void deleteById(UUID uuid);

    DescriptionDto findById(UUID uuid);

    List<DescriptionDto> findAll();
}
