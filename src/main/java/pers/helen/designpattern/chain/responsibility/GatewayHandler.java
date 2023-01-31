package pers.helen.designpattern.chain.responsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GatewayHandler {
    private GatewayEntity entity;
    private GatewayHandler next;
}
