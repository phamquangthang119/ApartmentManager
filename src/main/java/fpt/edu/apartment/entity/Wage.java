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
    @OneToOne
    @JoinColumn(name = "contractId")
    private Contract contract;
    @ManyToOne
    @JoinColumn(name = "approverId")
    private Employee employee;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

}
