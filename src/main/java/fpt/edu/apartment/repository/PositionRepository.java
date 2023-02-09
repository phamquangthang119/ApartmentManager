package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
