/* @author Vlad Zemec (C)2022 */
package test.senla.guide.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.service.api.DescriptionApproveService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/approve")
public class DescriptionApproveController {

    private final DescriptionApproveService approveService;

    @PostMapping("/apply")
    public void descriptionToApprove(@RequestBody DescriptionApproveDto approveDto) {
        approveService.createDescriptionApprove(approveDto);
    }
}
