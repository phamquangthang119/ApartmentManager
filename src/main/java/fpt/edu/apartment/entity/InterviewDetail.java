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
@Table(name = "InterviewDetail")
public class InterviewDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime updatedDate;
    private String description;
    @OneToOne //ko bik quan he la 1-1 hay nhiu`-1
    @JoinColumn(name = "interviewId")
    private Interview interview;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
