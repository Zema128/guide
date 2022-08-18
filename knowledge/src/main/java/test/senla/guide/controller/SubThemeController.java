/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.service.api.SubThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sub")
public class SubThemeController {

    private final SubThemeService subThemeService;

    @GetMapping("{uuid}")
    public SubThemeDto getSubThemeById(@PathVariable UUID uuid) {
        return subThemeService.getSubThemeByIdDto(uuid);
    }

    @GetMapping()
    public List<SubThemeDto> getSubThemes() {
        return subThemeService.getSubThemes();
    }
}
