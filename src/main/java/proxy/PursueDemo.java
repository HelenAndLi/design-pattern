package proxy;

public class PursueDemo {

    public static void main(String[] args){
        Pursued pursued = new Pursued("茉莉");

        Proxy proxy = new Proxy(pursued);
        proxy.giveGift();
        proxy.movies();
        proxy.shopping();
    }
}
