package compensation.domain;

import compensation.domain.*;
import compensation.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OutStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private String orderId;
}
