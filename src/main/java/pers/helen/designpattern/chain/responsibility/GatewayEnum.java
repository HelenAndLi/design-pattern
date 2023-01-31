package pers.helen.designpattern.chain.responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum GatewayEnum {

    API_HANDLE(new GatewayEntity("API接口限流", "pers.helen.designpattern.chain.responsibility.ApiGatewayHandler", 1, null,
            2)),
    BLACKLIST_HANDLE(new GatewayEntity("黑名单拦截", "pers.helen.designpattern.chain.responsibility.BlacklistGatewayHandler",
            2, 1,
            3)),
    SESSION_HANDLE(new GatewayEntity("用户会话拦截", "pers.helen.designpattern.chain.responsibility.SessionGatewayHandler", 3,
            2,
            null));


    private GatewayEntity gatewayEntity;


}
