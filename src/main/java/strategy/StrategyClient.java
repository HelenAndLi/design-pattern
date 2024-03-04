package strategy;

public class StrategyClient {

    public static void main(String[] args){
        CashContext context = new CashContext("打8折");
        System.out.println(context.getResult(100));
    }
}
