package cse.poc.crud.ekart_crud;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courier")
public class CourierMapping {
    @Autowired
    private CourierService service;

    @GetMapping("/")
    public List<Courier> viewAll(){
        return service.implementFindAll();
    }

    @GetMapping("/executive/{executiveName}")
    public List<Courier> viewByExecutive(@PathVariable("executiveName") String executiveName){
        return service.findByExecutive(executiveName);
    }

    @GetMapping("/address/{address}")
    public List<Courier> viewByAddress(@PathVariable("address") String address){
        return service.findByAddress(address);
    }

    @GetMapping("/receiver/{receiverName}")
    public List<Courier> viewByReceiver(@PathVariable("receiverName") String receiverName){
        return service.findByReceiver(receiverName);
    }

    @PostMapping("/")
    public Courier ip(@RequestBody Courier courier){
        return service.implementSave(courier);
    }

    @PutMapping("/")
    public Courier progress(@RequestBody Courier courier){
        return service.implementSave(courier);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable("id")int id){
        service.implementDelete(id);
        return id+ "has discharged";
    }
}
