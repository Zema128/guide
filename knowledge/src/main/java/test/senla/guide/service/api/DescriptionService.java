/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.DescriptionDto;

public interface DescriptionService {

    DescriptionDto update(DescriptionDto description);

    DescriptionDto save(DescriptionDto description);

    void deleteById(UUID uuid);

    DescriptionDto findById(UUID uuid);

    List<DescriptionDto> findAll();
}
