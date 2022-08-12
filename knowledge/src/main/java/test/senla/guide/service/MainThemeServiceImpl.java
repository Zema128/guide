package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.MainThemeDto;
import test.senla.guide.model.MainTheme;
import test.senla.guide.service.api.MainThemeService;

import java.util.List;
import java.util.UUID;

@Service
public class MainThemeServiceImpl implements MainThemeService {
    @Override
    public MainThemeDto update(MainTheme subTheme) {
        return null;
    }

    @Override
    public MainThemeDto save(MainTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public MainThemeDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<MainThemeDto> findAll() {
        return null;
    }
}
