package fpt.edu.apartment.entity;

import fpt.edu.apartment.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "WorkingSchedule")
public class WorkingSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date workDate;
    private Time begin;
    private Time end;
    private String type;
    @OneToOne
    @JoinColumn(name = "contractId")
    private Contract contract;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
