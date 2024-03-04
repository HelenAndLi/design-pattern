package strategy;

import simpleFactory.CashNormal;
import simpleFactory.CashRebate;
import simpleFactory.CashReturn;
import simpleFactory.CashSuper;

public class CashContext {

    private CashSuper cash;

    public CashContext(String type){
        switch(type){
            case "正常收费":
                this.cash = new CashNormal();
                break;
            case "满200减50":
                this.cash = new CashReturn(200, 50);
                break;
            case "打8折":
                this.cash = new CashRebate(0.8);
                break;
        }
    }

    public double getResult(double money){
        return cash.acceptCash(money);
    }
}
