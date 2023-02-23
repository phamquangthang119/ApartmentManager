package swp391.dsct_server.service;

import org.springframework.stereotype.Service;
import swp391.dsct_server.entity.Apartment;

import java.util.List;

@Service
public interface ApartmentService {
    boolean update(Apartment apartment);
    boolean delete(Long id);
    List<Apartment> findALl();
    Apartment findById(Long id);
}
