package fpt.edu.apartment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.security.cert.Certificate;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Certificate")
public class Cerfiticate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;
    private String certificateUrl;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
}
