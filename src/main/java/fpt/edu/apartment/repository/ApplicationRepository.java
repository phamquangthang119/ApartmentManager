package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
