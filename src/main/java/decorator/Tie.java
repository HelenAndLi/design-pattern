package decorator;

public class Tie extends DressUp {

    @Override
    public void show(){
        System.out.print("领带 ");
        super.show();
    }
}
