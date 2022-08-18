/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller.admin;

import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.service.api.MajorThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/major")
public class AdminMajorThemeController {

    private final MajorThemeService majorThemeService;

    @PutMapping("/update/{id}")
    public MajorThemeDto updateMajorTheme(
            @PathVariable UUID id, @Valid @RequestBody MajorThemeDto majorThemeDto) {
        return majorThemeService.updateMajorTheme(majorThemeDto, id);
    }

    @PostMapping("/create")
    public MajorThemeDto createMajorTheme(@Valid @RequestBody MajorThemeDto majorThemeDto) {
        return majorThemeService.createMajorTheme(majorThemeDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMajorTheme(@PathVariable UUID id) {
        majorThemeService.deleteMajorThemeById(id);
    }
}
