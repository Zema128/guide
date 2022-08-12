package test.senla.guide.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.SubTheme;

import java.util.UUID;

@Repository
public interface SubThemeDao extends CrudRepository<SubTheme, UUID> {
}
