package decorator;

public class Sneakers extends DressUp {

    @Override
    public void show(){
        System.out.print("球鞋 ");
        super.show();
    }
}
