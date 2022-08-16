package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dao.DescriptionDao;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.DescriptionMapper;
import test.senla.guide.service.api.DescriptionService;

import java.util.List;
import java.util.UUID;

@Service
public class DescriptionServiceImpl implements DescriptionService {

    private final DescriptionMapper mapper;
    private final DescriptionDao descriptionDao;

    public DescriptionServiceImpl(DescriptionMapper mapper, DescriptionDao descriptionDao) {
        this.mapper = mapper;
        this.descriptionDao = descriptionDao;
    }

    @Override
    public DescriptionDto update(DescriptionDto description) {
        return null;
    }

    @Override
    public DescriptionDto save(DescriptionDto description) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {
        descriptionDao.deleteById(uuid);
    }

    @Override
    public DescriptionDto findById(UUID uuid) {
        return mapper
                .descriptionToDescriptionDto(descriptionDao
                        .findById(uuid)
                        .orElseThrow(() -> new EntityNotFoundException(String.format("No description with id '%id'.", uuid))));
    }

    @Override
    public List<DescriptionDto> findAll() {
        return mapper.descriptionsToDescriptionDtoList(descriptionDao.findAll());
    }
}
