/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.service.api.DescriptionService;

@RequiredArgsConstructor
@RestController
@RequestMapping("/description")
public class DescriptionController {

    private final DescriptionService descriptionService;

    @GetMapping("{uuid}")
    public DescriptionDto getDescriptionById(@PathVariable UUID uuid) {
        return descriptionService.getDescriptionByIdDto(uuid);
    }

    @GetMapping()
    public List<DescriptionDto> getDescriptions() {
        return descriptionService.getDescriptions();
    }
}
