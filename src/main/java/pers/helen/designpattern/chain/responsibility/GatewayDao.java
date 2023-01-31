package pers.helen.designpattern.chain.responsibility;

public interface GatewayDao {

    GatewayEntity getByHandlerId(int handlerId);

    GatewayEntity getFirstGateway();
}
