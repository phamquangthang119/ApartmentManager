package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
