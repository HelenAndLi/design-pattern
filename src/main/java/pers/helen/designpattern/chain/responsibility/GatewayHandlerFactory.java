package pers.helen.designpattern.chain.responsibility;

import java.lang.reflect.InvocationTargetException;

public class GatewayHandlerFactory {

    private static GatewayDao gatewayDao = new GatewayDaoImpl();

    public static GatewayHandler getFirstHandler(){
        GatewayEntity firstGateway = gatewayDao.getFirstGateway();
        GatewayHandler firstHandler = getHandler(firstGateway);
        if(firstHandler == null){
            return null;
        }
        GatewayEntity temp = firstGateway;
        GatewayHandler tempHandler = firstHandler;
        int nextHandlerId;
        while((nextHandlerId = temp.getNextHandlerId()) != 0){
            GatewayEntity next = gatewayDao.getByHandlerId(nextHandlerId);
            GatewayHandler nextHandler = getHandler(next);
            tempHandler.setNext(nextHandler);
            temp = next;
            tempHandler = nextHandler;
        }
        return firstHandler;
    }

    public static GatewayHandler getHandler(GatewayEntity gatewayEntity){
        // 获取全限定类名
        String className = gatewayEntity.getConference();
        try{
            // 根据全限定类名，加载并初始化该类，即会初始化该类的静态段
            Class<?> clazz = Class.forName(className);
            return (GatewayHandler) clazz.getDeclaredConstructor().newInstance();
        }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e){
            e.printStackTrace();
        }
        return null;
    }
}
