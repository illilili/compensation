package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OutStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private String orderId;

    public OutStock(Inventory aggregate) {
        super(aggregate);
    }

    public OutStock() {
        super();
    }
}
//>>> DDD / Domain Event
