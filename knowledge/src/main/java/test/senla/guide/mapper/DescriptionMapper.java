/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.model.Description;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface DescriptionMapper {
    void update(@MappingTarget Description toUpdate, DescriptionDto descriptionDto);

    DescriptionDto mapToDescriptionDto(Description description);

    Description mapToDescription(DescriptionDto descriptionDto);

    List<DescriptionDto> mapToDescriptionDtos(List<Description> descriptions);

    List<Description> mapToDescriptions(List<DescriptionDto> descriptionDtos);
}
