package test.senla.guide.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.MainTheme;
import test.senla.guide.model.MajorTheme;

import java.util.UUID;

@Repository
public interface MainThemeDao extends CrudRepository<MainTheme, UUID> {
}
