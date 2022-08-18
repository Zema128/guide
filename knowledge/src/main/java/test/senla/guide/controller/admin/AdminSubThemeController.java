/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller.admin;

import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.service.api.SubThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/sub")
public class AdminSubThemeController {

    private final SubThemeService subThemeService;

    @PutMapping("/update/{id}")
    public SubThemeDto updateSubTheme(
            @PathVariable UUID id, @Valid @RequestBody SubThemeDto subThemeDto) {
        return subThemeService.updateSubTheme(id, subThemeDto);
    }

    @PostMapping("/create/{id}")
    public SubThemeDto createSubTheme(
            @PathVariable UUID id, @Valid @RequestBody SubThemeDto subThemeDto) {
        return subThemeService.createSubTheme(id, subThemeDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSubTheme(@PathVariable UUID id) {
        subThemeService.deleteSubThemeById(id);
    }
}
