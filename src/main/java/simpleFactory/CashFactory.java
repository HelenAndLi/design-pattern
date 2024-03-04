package simpleFactory;

/**
 * 收费工厂
 */
public class CashFactory {

    public static CashSuper createCashAccept(String type){
        CashSuper cash = null;
        switch(type){
            case "正常收费":
                cash = new CashNormal();
                break;
            case "满200减50":
                cash = new CashReturn(200, 50);
                break;
            case "打8折":
                cash = new CashRebate(0.8);
                break;
        }
        return cash;
    }
}
