package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Contract")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobType;
    private Float workingHours;
    private Float baseWage;
    private String currencyUnit;
    @OneToOne
    @JoinColumn(name = "positionId")
    private Position position;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
