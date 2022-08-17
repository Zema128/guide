/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;

public interface MainThemeService {
    MainThemeDto update(MainTheme subTheme);

    MainThemeDto save(MainTheme subTheme);

    void deleteById(UUID uuid);

    MainThemeDto findById(UUID uuid);

    List<MainThemeDto> findAll();
}
