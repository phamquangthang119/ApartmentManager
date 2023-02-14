package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String password;
    @OneToOne
    @JoinColumn(name="employeeId")
    private Employee employee;
    @OneToOne
    @JoinColumn(name="roleId")
    private Role role;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
