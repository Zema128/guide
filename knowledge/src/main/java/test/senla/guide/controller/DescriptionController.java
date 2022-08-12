package test.senla.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.DescriptionDto;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/description")
public class DescriptionController {

    @GetMapping("{uuid}")
    public DescriptionDto getDescriptionById(@PathVariable UUID uuid ){
        return new DescriptionDto();
    }

    @GetMapping()
    public List<DescriptionDto> getDescriptions(){
        return Collections.singletonList(new DescriptionDto());
    }
}
