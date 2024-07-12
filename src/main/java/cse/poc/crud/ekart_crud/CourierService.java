package cse.poc.crud.ekart_crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourierService {
    @Autowired
    CourierRemote remote;
    CourierRepository repository;

    public List<Courier> implementFindAll(){
        return remote.findAll();
    }

    public List<Courier> findByExecutive(String executiveName){
        return repository.findByExecutiveName(executiveName);
    }

    public List<Courier> findByAddress(String address){
        return repository.findByAddress(address);
    }

    public List<Courier> findByReceiver(String receiverName){
        return repository.findByReceiverName(receiverName);
    }

    public Courier implementSave(Courier courier){
        return remote.save(courier);
    }

    public void implementDelete(int id){
        remote.deleteById(id);
    }
}
