/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller.admin;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.dto.FinishedDescriptionDto;
import test.senla.guide.service.api.DescriptionApproveService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/approve")
public class AdminDescriptionApproveController {

    private final DescriptionApproveService approveService;

    @GetMapping()
    public List<DescriptionApproveDto> getDescriptionApproves() {
        return approveService.getDescriptionApproves();
    }

    @GetMapping("{uuid}")
    public DescriptionApproveDto getDescriptionApproveById(@PathVariable UUID uuid) {
        return approveService.getDescriptionApproveByIdDto(uuid);
    }

    @PutMapping("/update/{id}")
    public DescriptionApproveDto updateDescriptionApprove(
            @PathVariable UUID id, @RequestBody DescriptionApproveDto approveDto) {
        return approveService.updateDescriptionApprove(id, approveDto);
    }

    @PostMapping("/save")
    public void saveDescription(@RequestBody FinishedDescriptionDto descriptionDto) {
        approveService.saveDescription(descriptionDto);
    }
}
