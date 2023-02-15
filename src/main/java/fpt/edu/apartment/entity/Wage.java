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
@Table(name = "Wage")
public class Wage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Float amount;
    private String type;
    @ManyToOne
    @JoinColumn(name = "contractId")
    private Employee contract;
    @ManyToOne
    @JoinColumn(name = "approverId")
    private Employee approver;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

}
