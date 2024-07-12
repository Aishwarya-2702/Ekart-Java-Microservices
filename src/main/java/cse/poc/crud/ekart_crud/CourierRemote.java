package cse.poc.crud.ekart_crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourierRemote extends JpaRepository<Courier,Integer> {

}
