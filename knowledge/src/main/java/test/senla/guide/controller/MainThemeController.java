/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.service.api.MainThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/main")
public class MainThemeController {

    private final MainThemeService mainThemeService;

    @GetMapping("{uuid}")
    public MainThemeDto getMainThemeById(@PathVariable UUID uuid) {
        return mainThemeService.findById(uuid);
    }

    @GetMapping()
    public List<MainThemeDto> getMainThemes() {
        return mainThemeService.findAll();
    }
}
