package swp391.dsct_server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import swp391.dsct_server.entity.Role;
import swp391.dsct_server.enums.EnumRole;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(EnumRole name);
}
