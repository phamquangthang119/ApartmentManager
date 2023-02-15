package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Report")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String imgUrl;
    private Date initiatedDate;
    private Date terminatedDate;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
