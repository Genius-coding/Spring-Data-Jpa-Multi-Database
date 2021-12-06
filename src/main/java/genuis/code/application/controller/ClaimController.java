package genuis.code.application.controller;

import genuis.code.domain.entities.functional.Claim;
import genuis.code.domain.repository.functional.ClaimRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ClaimController {

    private ClaimRepository claimRepository;

    public ClaimController(ClaimRepository claimRepository) {
        this.claimRepository = claimRepository;
    }

    @GetMapping(path = "/claims", produces = "application/json")
    public List<Claim> getClaims(){
        return claimRepository.findAll();
    }

    @GetMapping(path = "/claim/{id}", produces = "application/json")
    public Claim getClaimById(@PathVariable Long id){
        return claimRepository.getById(id);
    }

    @PostMapping(path = "/claim", produces = "application/json")
    public Claim addClaim(@RequestBody Claim claim){
        return claimRepository.save(claim);
    }

    @DeleteMapping(path = "/claim/{id}", produces = "application/json")
    public void deleteClaim(@PathVariable Long id){
        claimRepository.delete(claimRepository.getById(id));
    }
}
