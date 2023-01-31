package pers.helen.designpattern.chain.responsibility;

import java.util.HashMap;
import java.util.Map;

public class GatewayDaoImpl implements GatewayDao {

    private static Map<Integer, GatewayEntity> gatewayMap = new HashMap<>();

    static{
        GatewayEnum[] enums = GatewayEnum.values();
        for(GatewayEnum gateway : enums){
            GatewayEntity gatewayEntity = gateway.getGatewayEntity();
            gatewayMap.put(gatewayEntity.getHandlerId(), gatewayEntity);
        }
    }

    @Override
    public GatewayEntity getByHandlerId(int handlerId){
        return gatewayMap.get(handlerId);
    }

    @Override
    public GatewayEntity getFirstGateway(){
        for(Map.Entry<Integer, GatewayEntity> entry : gatewayMap.entrySet()){
            if(entry.getValue().getPreHandlerId() == null){
                return entry.getValue();
            }
        }
        return null;
    }
}
