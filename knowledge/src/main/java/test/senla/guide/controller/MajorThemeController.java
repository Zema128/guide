/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.service.api.MajorThemeService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/major")
public class MajorThemeController {

    private final MajorThemeService majorThemeService;

    @GetMapping("{uuid}")
    public MajorThemeDto getMajorThemeById(@PathVariable UUID uuid) {
        return majorThemeService.findById(uuid);
    }

    @GetMapping()
    public List<MajorThemeDto> getMajorThemes() {
        return majorThemeService.findAll();
    }
}
