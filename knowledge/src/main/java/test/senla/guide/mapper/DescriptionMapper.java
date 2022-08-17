/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.model.Description;

@Mapper(componentModel = "spring")
public interface DescriptionMapper {

    DescriptionDto mapToDescriptionDto(Description description);

    Description mapToDescription(DescriptionDto descriptionDto);

    List<DescriptionDto> mapToDescriptionDtos(List<Description> descriptions);

    List<Description> mapToDescriptions(List<DescriptionDto> descriptionDtos);
}
