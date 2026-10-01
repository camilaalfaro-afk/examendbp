package Entity;
import java.math.*;
import Enum.ProdSattus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name="products")
@NoArgsConstructor

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private BigDecimal precio;
    @Column(nullable=false)
    private Integer stock;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private ProdSattus status;
}
