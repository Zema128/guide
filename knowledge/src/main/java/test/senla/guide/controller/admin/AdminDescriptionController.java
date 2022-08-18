/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller.admin;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.service.api.DescriptionService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/sub")
public class AdminDescriptionController {

    private final DescriptionService descriptionService;

    @PutMapping("/update/{id}")
    public DescriptionDto updateDescription(
            @PathVariable UUID id, @RequestBody DescriptionDto descriptionDto) {
        return descriptionService.updateDescription(id, descriptionDto);
    }

    @PostMapping("/create/{id}")
    public DescriptionDto createDescription(
            @PathVariable UUID id, @RequestBody DescriptionDto descriptionDto) {
        return descriptionService.createDescription(id, descriptionDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDescription(@PathVariable UUID id) {
        descriptionService.deleteDescriptionById(id);
    }
}
