package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private String avatarUrl;
    private Date dateOfBirth;
    private String identificationId;
    @OneToOne
    @JoinColumn(name = "contractId")
    private Contract contract;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
