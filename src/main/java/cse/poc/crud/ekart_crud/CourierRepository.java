package cse.poc.crud.ekart_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRepository extends JpaRepository<Courier, Integer> {
    List<Courier> findByExecutiveName(String executiveName);
    List<Courier> findByAddress(String address);
    List<Courier> findByReceiverName(String receiverName);
}
