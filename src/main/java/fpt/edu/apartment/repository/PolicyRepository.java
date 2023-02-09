package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
}
