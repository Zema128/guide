package test.senla.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.SubThemeDto;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sub")
public class SubThemeController {
    @GetMapping("{uuid}")
    public SubThemeDto getSubThemeById(@PathVariable UUID uuid) {
        return new SubThemeDto();
    }

    @GetMapping()
    public List<SubThemeDto> getSubThemes() {
        return Collections.singletonList(new SubThemeDto());
    }
}
