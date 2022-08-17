/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service.api;

import java.util.List;
import java.util.UUID;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;

public interface SubThemeService {

    SubThemeDto update(SubTheme subTheme);

    SubThemeDto save(SubTheme subTheme);

    void deleteById(UUID uuid);

    SubThemeDto findById(UUID uuid);

    List<SubThemeDto> findAll();
}
