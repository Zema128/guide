package test.senla.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.MainThemeDto;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/main")
public class MainThemeController {

    @GetMapping("{uuid}")
    public MainThemeDto getMainThemeById(@PathVariable UUID uuid){
        return new MainThemeDto();
    }

    @GetMapping()
    public List<MainThemeDto> getMainThemes(){
        return Collections.singletonList(new MainThemeDto());
    }

}
