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
@Table(name = "TimeSheet")
public class TimeSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
    private String room;
    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employe;
    @ManyToOne
    @JoinColumn(name = "apartmentId")
    private Employee apartment;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}

