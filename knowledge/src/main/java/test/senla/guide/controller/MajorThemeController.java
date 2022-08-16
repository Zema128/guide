package test.senla.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.MajorThemeDto;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/major")
public class MajorThemeController {

    @GetMapping("{uuid}")
    public MajorThemeDto getMajorThemeById(@PathVariable UUID uuid) {
        return new MajorThemeDto();
    }

    @GetMapping()
    public List<MajorThemeDto> getMajorThemes() {
        return Collections.singletonList(new MajorThemeDto());
    }
}
