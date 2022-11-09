package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAceepted extends AbstractEvent {

    private Long id;
    private String status;
    private String foodId;
    private String orderId;
    private List<String> options;
    private String storeId;

    public OrderAceepted(FoodCooking aggregate){
        super(aggregate);
    }
    public OrderAceepted(){
        super();
    }
}
