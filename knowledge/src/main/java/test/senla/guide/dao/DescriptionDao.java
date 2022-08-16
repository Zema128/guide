package test.senla.guide.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.Description;

import java.util.UUID;

@Repository
public interface DescriptionDao extends JpaRepository<Description, UUID> {
}
