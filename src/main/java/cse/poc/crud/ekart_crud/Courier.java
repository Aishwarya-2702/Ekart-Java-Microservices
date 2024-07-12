package cse.poc.crud.ekart_crud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//table creation
@Entity
public class Courier {
    // primary id
    @Id
    // auto increment
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int parcelId;
    private String receiverName;
    private String parcelItemName;
    private String receiverAddress;
    private Long receiverContact;
    private Double itemPrice;
    private String itemStatus;
    private String executiveName;

    public String getExecutiveName() {
        return executiveName;
    }
}
