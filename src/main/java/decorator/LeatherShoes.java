package decorator;

public class LeatherShoes extends DressUp{

    @Override
    public void show(){
        System.out.print("皮鞋 ");
        super.show();
    }
}
