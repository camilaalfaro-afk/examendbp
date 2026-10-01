package Entity;
import java.math.*;
import Enum.FoStatus;
import java.time.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Table(name="orders")
@NoArgsConstructor

public class FoodOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable=false)
    private BigDecimal totalAmount;
    @Column(nullable=false)
    private Integer quantity;
    @Column(nullable=false)
    private ZonedDateTime createdAt;
    @Enumerated(EnumType.STRING)
    @Column(nullable=false)
    private FoStatus status;

}