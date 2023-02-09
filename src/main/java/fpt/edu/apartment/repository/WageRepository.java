package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Wage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WageRepository extends JpaRepository<Wage, Long> {
}
