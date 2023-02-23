package swp391.dsct_server.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Department")
public class Department implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String status;
    @ManyToOne
    @JoinColumn(name = "apartment_id")
    @JsonBackReference
    private Apartment apartment;
    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    private List<JobPosition> jobPositions;
}
