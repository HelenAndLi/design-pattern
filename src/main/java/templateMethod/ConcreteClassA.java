package templateMethod;

public class ConcreteClassA extends AbstractClass{

    @Override
    public void operation1(){
        System.out.println("具体类A方法1实现");
    }

    @Override
    public void operation2(){
        System.out.println("具体类A方法2实现");
    }
}
