package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Long> {
}
