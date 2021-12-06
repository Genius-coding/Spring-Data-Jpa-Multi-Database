package genuis.code.domain.entities.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "BankAccount")
@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccount {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id ;
    private String label;
    @OneToOne(mappedBy = "bankAccount")
    private Claim claim;
}
