package test.senla.guide.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.DescriptionApprove;

import java.util.UUID;

@Repository
public interface DescriptionApproveDao extends CrudRepository<UUID, DescriptionApprove> {
}
