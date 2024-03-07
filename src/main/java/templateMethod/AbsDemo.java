package templateMethod;

public class AbsDemo {

    public static void main(String[] args){
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();

        a =  new ConcreteClassB();
        a.templateMethod();
    }
}
