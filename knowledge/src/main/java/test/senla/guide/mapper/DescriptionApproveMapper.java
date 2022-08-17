/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.model.DescriptionApprove;

@Mapper(componentModel = "spring")
public interface DescriptionApproveMapper {
    DescriptionApproveDto mapToDescriptionApproveDto(DescriptionApprove approve);

    DescriptionApprove mapToDescriptionApprove(DescriptionApproveDto approveDto);

    List<DescriptionApproveDto> mapToDescriptionApproveDtos(List<DescriptionApprove> approves);

    List<DescriptionApprove> mapToDescriptionApproves(List<DescriptionApproveDto> approveDtos);
}
