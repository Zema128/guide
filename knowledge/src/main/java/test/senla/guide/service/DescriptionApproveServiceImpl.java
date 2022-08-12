package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.DescriptionApproveDto;
import test.senla.guide.model.DescriptionApprove;
import test.senla.guide.service.api.DescriptionApproveService;

import java.util.List;
import java.util.UUID;

@Service
public class DescriptionApproveServiceImpl implements DescriptionApproveService {
    @Override
    public DescriptionApproveDto update(DescriptionApprove approveRecord) {
        return null;
    }

    @Override
    public DescriptionApproveDto save(DescriptionApprove approveRecord) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public DescriptionApproveDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<DescriptionApproveDto> findAll() {
        return null;
    }
}
