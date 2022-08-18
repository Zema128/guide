/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.model.MajorTheme;

@Mapper(
        componentModel = "spring",
        uses = {MainThemeMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MajorThemeMapper {

    void update(@MappingTarget MajorTheme toUpdate, MajorThemeDto majorThemeDto);

    MajorThemeDto mapToMajorThemeDto(MajorTheme majorTheme);

    MajorTheme mapToMajorTheme(MajorThemeDto majorThemeDto);

    List<MajorThemeDto> mapToMajorThemeDtos(List<MajorTheme> majorThemes);

    List<MajorTheme> mapToMajorThemes(List<MajorThemeDto> majorThemeDtos);
}
