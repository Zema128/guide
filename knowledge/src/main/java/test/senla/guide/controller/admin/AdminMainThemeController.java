/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller.admin;

import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.service.api.MainThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/main")
public class AdminMainThemeController {

    private final MainThemeService mainThemeService;

    @PutMapping("/update/{id}")
    public MainThemeDto updateMainTheme(
            @PathVariable UUID id, @Valid @RequestBody MainThemeDto mainThemeDto) {
        return mainThemeService.updateMainTheme(id, mainThemeDto);
    }

    @PostMapping("/create/{id}")
    public MainThemeDto createMainTheme(
            @PathVariable UUID id, @Valid @RequestBody MainThemeDto mainThemeDto) {
        return mainThemeService.createMainTheme(id, mainThemeDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMainTheme(@PathVariable UUID id) {
        mainThemeService.deleteMainThemeById(id);
    }
}
