package proxy;

public class Proxy implements Way{

    private Pursuing pursuing;

    public Proxy(Pursued pursued){
        pursuing = new Pursuing(pursued);
    }
    @Override
    public void giveGift(){
        pursuing.giveGift();
    }

    @Override
    public void movies(){
        pursuing.movies();
    }

    @Override
    public void shopping(){
        pursuing.shopping();
    }
}
