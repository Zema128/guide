package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.model.Description;
import test.senla.guide.service.api.DescriptionService;

import java.util.List;
import java.util.UUID;

@Service
public class DescriptionServiceImpl implements DescriptionService {
    @Override
    public DescriptionDto update(Description description) {
        return null;
    }

    @Override
    public DescriptionDto save(Description description) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public DescriptionDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<DescriptionDto> findAll() {
        return null;
    }
}
