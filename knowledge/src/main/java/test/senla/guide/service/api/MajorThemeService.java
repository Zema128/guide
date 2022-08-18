/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.model.MajorTheme;

public interface MajorThemeService {

    MajorThemeDto updateMajorTheme(MajorThemeDto subTheme, UUID majorThemeId);

    MajorThemeDto createMajorTheme(MajorThemeDto subTheme);

    void deleteMajorThemeById(UUID uuid);

    MajorThemeDto getMajorThemeByIdDto(UUID uuid);

    MajorTheme getMajorThemeById(UUID uuid);

    List<MajorThemeDto> getMajorThemes();
}
