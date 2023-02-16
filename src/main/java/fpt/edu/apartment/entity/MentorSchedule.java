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
@Table(name = "MentorSchedule")
public class MentorSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String note;
    private String type;
    private LocalDateTime classDate;
    @OneToOne
    @JoinColumn(name = "learningPathId")
    private LearningPath learningPath;
    @ManyToOne
    @JoinColumn(name = "mentorId")
    private Employee mentor;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
