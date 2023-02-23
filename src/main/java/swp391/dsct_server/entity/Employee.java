package swp391.dsct_server.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Employee")
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phone;
    private String email;
    private Date dateOfBirth;
    private String identificationId;
    private String avatarUrl;
    private String bankAccount;
    private String bankName;
    private String status;
    @OneToOne(mappedBy = "employee")
    @JsonBackReference
    private Account account;
}
