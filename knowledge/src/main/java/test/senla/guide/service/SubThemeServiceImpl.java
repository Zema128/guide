package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.SubThemeDto;
import test.senla.guide.model.SubTheme;
import test.senla.guide.service.api.SubThemeService;

import java.util.List;
import java.util.UUID;

@Service
public class SubThemeServiceImpl implements SubThemeService {
    @Override
    public SubThemeDto update(SubTheme subTheme) {
        return null;
    }

    @Override
    public SubThemeDto save(SubTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public SubThemeDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<SubThemeDto> findAll() {
        return null;
    }
}
