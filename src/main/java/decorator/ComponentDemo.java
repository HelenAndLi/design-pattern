package decorator;

public class ComponentDemo {

    public static void main(String[] args){
        ConcreteComponent c = new ConcreteComponent();
        ConcreteDecoratorA da = new ConcreteDecoratorA();
        ConcreteDecoratorB db = new ConcreteDecoratorB();
        da.setComponent(c);
        db.setComponent(da);
        db.operation();
    }
}
