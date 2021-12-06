package genuis.code.domain.entities.functional;

import genuis.code.domain.entities.technical.Administrator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Claim")
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Claim implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    private String administrator;

    private LocalDate dateOfReceipt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private BankAccount bankAccount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tier_id", referencedColumnName = "id")
    private Tier tier;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "claim_details_id", referencedColumnName = "id")
    private ClaimDetails claimDetails;

}
