package genuis.code.domain.entities.functional;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "ClaimDetails")
@Data @AllArgsConstructor @NoArgsConstructor
public class ClaimDetails implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    private String claimObject;
    private String claimType;
    private String claimMessage;
    private String attachments;
    @OneToOne(mappedBy = "claimDetails")
    private Claim claim;
}
