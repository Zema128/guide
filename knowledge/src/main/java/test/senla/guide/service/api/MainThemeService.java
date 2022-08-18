/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;

public interface MainThemeService {

    MainThemeDto updateMainTheme(UUID mainId, MainThemeDto mainThemeDto);

    MainThemeDto createMainTheme(UUID majorId, MainThemeDto mainThemeDto);

    void deleteMainThemeById(UUID uuid);

    MainThemeDto getMainThemeDto(UUID mainId);

    MainTheme getMainThemeById(UUID uuid);

    List<MainThemeDto> getMainThemes();
}
