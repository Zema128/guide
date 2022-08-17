/* @author Vlad Zemec (C)2022 */
package test.senla.guide.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.senla.guide.model.Description;

@Repository
public interface DescriptionDao extends JpaRepository<Description, UUID> {}
