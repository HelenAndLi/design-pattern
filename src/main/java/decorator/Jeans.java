package decorator;

public class Jeans extends DressUp{

    @Override
    public void show(){
        System.out.print("牛仔裤 ");
        super.show();
    }
}
