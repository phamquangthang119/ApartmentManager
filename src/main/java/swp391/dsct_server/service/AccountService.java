package swp391.dsct_server.service;

import org.springframework.stereotype.Service;
import swp391.dsct_server.entity.Account;

import java.util.List;

@Service
public interface AccountService {
    boolean update(Account account);
    boolean delete(Long id);
    List<Account> findAll();
    Account findById(Long id);
}
