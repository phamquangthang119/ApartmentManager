package swp391.dsct_server.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String status;
    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonBackReference
    private Role role;
    @OneToOne
    @JoinColumn(name = "employee_id")
    @JsonManagedReference
    private Employee employee;
}
