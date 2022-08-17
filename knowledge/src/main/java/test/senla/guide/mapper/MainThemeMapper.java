/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;

@Mapper(
        componentModel = "spring",
        uses = {SubThemeMapper.class})
public interface MainThemeMapper {
    MainThemeDto mapToMainThemeDto(MainTheme mainTheme);

    MainTheme mapToMainTheme(MainThemeDto mainThemeDto);

    List<MainThemeDto> mapToMainThemeDtos(List<MainTheme> mainThemes);

    List<MainTheme> mapToMainThemes(List<MainThemeDto> mainThemeDtos);
}
