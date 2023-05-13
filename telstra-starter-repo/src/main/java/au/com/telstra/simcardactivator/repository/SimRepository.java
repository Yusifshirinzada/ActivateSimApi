package au.com.telstra.simcardactivator.repository;

import au.com.telstra.simcardactivator.model.Sim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimRepository extends JpaRepository<Sim,String> {
}
