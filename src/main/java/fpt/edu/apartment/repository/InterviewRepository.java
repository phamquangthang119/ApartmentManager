package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InterviewRepository extends JpaRepository<Interview, Long> {
}
