/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.model.MajorTheme;

@Mapper(
        componentModel = "spring",
        uses = {MainThemeMapper.class})
public interface MajorThemeMapper {
    MajorThemeDto mapToMajorThemeDto(MajorTheme majorTheme);

    MajorTheme mapToMajorTheme(MajorThemeDto majorThemeDto);

    List<MajorThemeDto> mapToMajorThemeDtos(List<MajorTheme> majorThemes);

    List<MajorTheme> mapToMajorThemes(List<MajorThemeDto> majorThemeDtos);
}
