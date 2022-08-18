/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;

public interface SubThemeService {

    SubThemeDto updateSubTheme(UUID subId, SubThemeDto subThemeDto);

    SubThemeDto createSubTheme(UUID mainId, SubThemeDto subThemeDto);

    void deleteSubThemeById(UUID uuid);

    SubThemeDto getSubThemeByIdDto(UUID uuid);

    SubTheme getSubThemeById(UUID uuid);

    List<SubThemeDto> getSubThemes();
}
