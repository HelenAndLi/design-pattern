package decorator;

public class ConcreteDecoratorB extends Decorator {

    @Override
    public void operation(){
        super.operation();
        addBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void addBehavior(){
        System.out.println("具体装饰对象B区别于A的方法");
    }
}
