package genuis.code.domain.entities.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "Tier")
@Data @AllArgsConstructor @NoArgsConstructor
public class Tier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    private String name;
    private String lastName;
    private String institution;
    private String message;
    @OneToOne(mappedBy = "tier")
    private Claim claim;
}
