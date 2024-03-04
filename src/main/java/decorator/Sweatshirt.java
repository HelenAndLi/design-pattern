package decorator;

public class Sweatshirt extends DressUp{

    @Override
    public void show(){
        System.out.print("卫衣 ");
        super.show();
    }
}
