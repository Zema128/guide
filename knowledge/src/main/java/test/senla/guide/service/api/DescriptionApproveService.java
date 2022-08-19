/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.dto.FinishedDescriptionDto;
import test.senla.guide.model.DescriptionApprove;

public interface DescriptionApproveService {

    DescriptionApproveDto updateDescriptionApprove(
            UUID approveId, DescriptionApproveDto approveDto);

    DescriptionApproveDto createDescriptionApprove(DescriptionApproveDto approveDto);

    void saveDescription(FinishedDescriptionDto descriptionDto);

    void deleteDescriptionApproveById(UUID uuid);

    DescriptionApproveDto getDescriptionApproveByIdDto(UUID uuid);

    DescriptionApprove getDescriptionApproveById(UUID uuid);

    List<DescriptionApproveDto> getDescriptionApproves();
}
