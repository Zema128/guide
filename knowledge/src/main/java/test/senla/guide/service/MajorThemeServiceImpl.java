package test.senla.guide.service;

import org.springframework.stereotype.Service;
import test.senla.guide.dto.MajorThemeDto;
import test.senla.guide.model.MajorTheme;
import test.senla.guide.service.api.MajorThemeService;

import java.util.List;
import java.util.UUID;

@Service
public class MajorThemeServiceImpl implements MajorThemeService {


    @Override
    public MajorThemeDto update(MajorTheme subTheme) {
        return null;
    }

    @Override
    public MajorThemeDto save(MajorTheme subTheme) {
        return null;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public MajorThemeDto findById(UUID uuid) {
        return null;
    }

    @Override
    public List<MajorThemeDto> findAll() {
        return null;
    }
}
