package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Cerfiticate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CertificateRepository extends JpaRepository<Cerfiticate, Long> {
}
