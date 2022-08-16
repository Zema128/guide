package test.senla.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.service.api.DescriptionService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/description")
public class DescriptionController {

    private final DescriptionService descriptionService;

    public DescriptionController(DescriptionService descriptionService) {
        this.descriptionService = descriptionService;
    }

    @GetMapping("{uuid}")
    public DescriptionDto getDescriptionById(@PathVariable UUID uuid) {
        return descriptionService.findById(uuid);
    }

    @GetMapping()
    public List<DescriptionDto> getDescriptions() {
        return descriptionService.findAll();
    }
}
