/* @author Vlad Zemec (C)2022 */
package test.senla.guide.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import test.senla.guide.dao.DescriptionDao;
import test.senla.guide.dto.DescriptionDto;
import test.senla.guide.exception.EntityNotFoundException;
import test.senla.guide.mapper.DescriptionMapper;
import test.senla.guide.service.api.DescriptionService;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@Service
public class DescriptionServiceImpl implements DescriptionService {

    private final DescriptionMapper mapper;
    private final DescriptionDao descriptionDao;

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
        return mapper.mapToDescriptionDto(
                descriptionDao
                        .findById(uuid)
                        .orElseThrow(
                                () ->
                                        new EntityNotFoundException(
                                                String.format(
                                                        "No description with id '%s'.", uuid))));
    }

    @Override
    public List<DescriptionDto> findAll() {
        return mapper.mapToDescriptionDtos(descriptionDao.findAll());
    }
}
