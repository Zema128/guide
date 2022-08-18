/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;

@Mapper(
        componentModel = "spring",
        uses = {DescriptionMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface SubThemeMapper {
    void update(@MappingTarget SubTheme toUpdate, SubThemeDto subThemeDto);

    SubThemeDto mapToSubThemeDto(SubTheme subTheme);

    SubTheme mapToSubTheme(SubThemeDto subThemeDto);

    List<SubThemeDto> mapToSubThemeDtos(List<SubTheme> subThemes);

    List<SubTheme> mapToSubThemes(List<SubThemeDto> subThemeDtos);
}
