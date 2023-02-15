package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Interview")
public class Interview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime interviewDate;
    @OneToOne
    @JoinColumn(name = "applicationId")
    private Application application;
    @ManyToOne
    @JoinColumn(name = "managerId")
    private Employee manager;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
