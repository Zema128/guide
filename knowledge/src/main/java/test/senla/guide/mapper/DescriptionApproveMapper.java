/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.model.DescriptionApprove;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface DescriptionApproveMapper {

    void update(@MappingTarget DescriptionApprove toUpdate, DescriptionApproveDto approveDto);

    DescriptionApproveDto mapToDescriptionApproveDto(DescriptionApprove approve);

    DescriptionApprove mapToDescriptionApprove(DescriptionApproveDto approveDto);

    List<DescriptionApproveDto> mapToDescriptionApproveDtos(List<DescriptionApprove> approves);

    List<DescriptionApprove> mapToDescriptionApproves(List<DescriptionApproveDto> approveDtos);
}
