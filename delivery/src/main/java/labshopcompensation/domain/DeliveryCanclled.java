package labshopcompensation.domain;

import java.util.*;
import labshopcompensation.domain.*;
import labshopcompensation.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class DeliveryCanclled extends AbstractEvent {

    private Long id;
    private String customerId;

    public DeliveryCanclled(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCanclled() {
        super();
    }
}
