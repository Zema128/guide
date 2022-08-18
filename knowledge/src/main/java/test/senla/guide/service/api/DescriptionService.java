/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.model.Description;

public interface DescriptionService {

    DescriptionDto updateDescription(UUID descriptionId, DescriptionDto description);

    DescriptionDto createDescription(UUID subId, DescriptionDto description);

    void deleteDescriptionById(UUID uuid);

    DescriptionDto getDescriptionByIdDto(UUID uuid);

    Description getDescriptionById(UUID uuid);

    List<DescriptionDto> getDescriptions();
}
