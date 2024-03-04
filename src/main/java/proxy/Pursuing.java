package proxy;

public class Pursuing implements Way {

    private Pursued pursued;

    public Pursuing(Pursued pursued){
        this.pursued = pursued;
    }

    @Override
    public void giveGift(){
        System.out.println("To " + pursued.getName() + ", 送你礼物");
    }

    @Override
    public void movies(){
        System.out.println("To " + pursued.getName() + ", 去看电影吗");
    }

    @Override
    public void shopping(){
        System.out.println("To " + pursued.getName() + ", 去逛街吗");
    }
}
