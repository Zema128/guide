package test.senla.guide.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.Description;

import java.util.UUID;

@Repository
public interface DescriptionDao extends CrudRepository<Description, UUID> {
}
