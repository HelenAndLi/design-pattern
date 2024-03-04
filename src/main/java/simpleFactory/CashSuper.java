package simpleFactory;

/**
 * 收费抽象类
 */
public abstract class CashSuper {
    // 参数为原价，返回为当前价
    public abstract double acceptCash(double money);
}
