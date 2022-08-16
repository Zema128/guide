package test.senla.guide.mapper;

import org.mapstruct.Mapper;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.model.Description;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DescriptionMapper {
    DescriptionDto descriptionToDescriptionDto(Description description);

    Description descriptionDtoToDescription(DescriptionDto descriptionDto);

    List<DescriptionDto> descriptionsToDescriptionDtoList(List<Description> description);

    List<Description> descriptionDtoListToDescriptions(List<DescriptionDto> descriptionDto);
}
