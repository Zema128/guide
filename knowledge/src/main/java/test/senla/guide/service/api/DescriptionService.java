package test.senla.guide.service.api;

import test.senla.guide.dto.DescriptionDto;

import java.util.List;
import java.util.UUID;

public interface DescriptionService {

    DescriptionDto update(DescriptionDto description);

    DescriptionDto save(DescriptionDto description);

    void deleteById(UUID uuid);

    DescriptionDto findById(UUID uuid);

    List<DescriptionDto> findAll();
}
