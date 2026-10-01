package Entity;
import Enum.StoreStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name="stores")
@NoArgsConstructor

public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false,unique= true)
    private String name;
    @Column(nullable=false)
    private String location;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private StoreStatus status;
    @ManyToONe()
    @OneToMany()
}
