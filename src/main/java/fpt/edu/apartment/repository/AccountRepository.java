package fpt.edu.apartment.repository;

import fpt.edu.apartment.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
