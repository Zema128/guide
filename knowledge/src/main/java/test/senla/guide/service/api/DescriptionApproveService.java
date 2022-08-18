/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.model.DescriptionApprove;

public interface DescriptionApproveService {

    DescriptionApproveDto update(DescriptionApprove approveRecord);

    DescriptionApproveDto save(DescriptionApprove approveRecord);

    void deleteById(UUID uuid);

    DescriptionApproveDto findById(UUID uuid);

    List<DescriptionApproveDto> findAll();
}
