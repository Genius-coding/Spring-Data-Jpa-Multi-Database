package genuis.code;

import genuis.code.domain.entities.functional.Claim;
import genuis.code.domain.repository.functional.ClaimDetailsRepository;
import genuis.code.domain.repository.functional.ClaimRepository;
import genuis.code.domain.repository.functional.TierRepository;
import genuis.code.domain.repository.technical.AdministratorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ClaimApplication  implements CommandLineRunner {

    private RepositoryRestConfiguration repositoryRestConfiguration;
    private ClaimRepository claimRepository;
    private ClaimDetailsRepository claimDetailsRepository;
    private TierRepository tierRepository;
    private AdministratorRepository administratorRepository;

    public ClaimApplication(RepositoryRestConfiguration repositoryRestConfiguration, ClaimRepository claimRepository, ClaimDetailsRepository claimDetailsRepository, TierRepository tierRepository, AdministratorRepository administratorRepository) {
        this.repositoryRestConfiguration = repositoryRestConfiguration;
        this.claimRepository = claimRepository;
        this.claimDetailsRepository = claimDetailsRepository;
        this.tierRepository = tierRepository;
        this.administratorRepository = administratorRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClaimApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Claim.class);
    /*    repositoryRestConfiguration.useHalAsDefaultJsonMediaType(false);*/
        //repositoryRestConfiguration.setDefaultMediaType(MediaType.APPLICATION_JSON);
/*
        claimRepository.save(new Claim(null,"Mohamed BOUSSARSAR", new Client(), new Tier(),new ClaimDetails() ));
        claimRepository.save(new Claim(null,"Hichem DEBBECH", new Client(), new Tier(),new ClaimDetails() ));
        claimRepository.save(new Claim(null,"Hamdi Jmal", new Client(), new Tier(),new ClaimDetails() ));*/




    }
}
