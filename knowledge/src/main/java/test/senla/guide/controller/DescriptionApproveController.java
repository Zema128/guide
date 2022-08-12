package test.senla.guide.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import test.senla.guide.dto.DescriptionApproveDto;

@RestController
@RequiredArgsConstructor
@RequestMapping("/description-approve")
public class DescriptionApproveController {

    @PostMapping()
    public void descriptionToApprove(@RequestBody DescriptionApproveDto approveDto){

    }
}
