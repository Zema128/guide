/* @author Vlad Zemec (C)2022 */
package test.senla.guide.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;

@Mapper(
        componentModel = "spring",
        uses = {DescriptionMapper.class})
public interface SubThemeMapper {
    SubThemeDto mapToSubThemeDto(SubTheme subTheme);

    SubTheme mapToSubTheme(SubThemeDto subThemeDto);

    List<SubThemeDto> mapToSubThemeDtos(List<SubTheme> subThemes);

    List<SubTheme> mapToSubThemes(List<SubThemeDto> subThemeDtos);
}
