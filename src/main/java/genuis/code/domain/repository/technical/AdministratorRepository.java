package genuis.code.domain.repository.technical;

import genuis.code.domain.entities.technical.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
