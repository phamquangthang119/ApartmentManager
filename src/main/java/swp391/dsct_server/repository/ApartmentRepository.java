package swp391.dsct_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swp391.dsct_server.entity.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
