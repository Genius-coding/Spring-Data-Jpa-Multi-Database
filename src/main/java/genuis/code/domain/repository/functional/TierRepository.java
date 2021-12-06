package genuis.code.domain.repository.functional;

import genuis.code.domain.entities.functional.Tier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface TierRepository extends JpaRepository<Tier, Long> {
}
