/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;

@Mapper(
        componentModel = "spring",
        uses = {SubThemeMapper.class},
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MainThemeMapper {
    void update(@MappingTarget MainTheme toUpdate, MainThemeDto mainThemeDto);

    MainThemeDto mapToMainThemeDto(MainTheme mainTheme);

    MainTheme mapToMainTheme(MainThemeDto mainThemeDto);

    List<MainThemeDto> mapToMainThemeDtos(List<MainTheme> mainThemes);

    List<MainTheme> mapToMainThemes(List<MainThemeDto> mainThemeDtos);
}
