/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.model.MajorTheme;

public interface MajorThemeService {

    MajorThemeDto update(MajorTheme subTheme);

    MajorThemeDto save(MajorTheme subTheme);

    void deleteById(UUID uuid);

    MajorThemeDto findById(UUID uuid);

    List<MajorThemeDto> findAll();
}
