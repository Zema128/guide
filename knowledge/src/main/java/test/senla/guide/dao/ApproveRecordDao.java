package test.senla.guide.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.ApproveRecord;

import java.util.UUID;

@Repository
public interface ApproveRecordDao extends CrudRepository<UUID, ApproveRecord> {
}
