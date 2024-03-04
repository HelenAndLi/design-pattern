package decorator;

public class Suit extends DressUp {

    @Override
    public void show(){
        System.out.print("西装 ");
        super.show();
    }
}
