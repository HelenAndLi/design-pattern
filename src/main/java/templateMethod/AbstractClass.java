package templateMethod;

public abstract class AbstractClass {

    /**
     * 一些抽象行为，放在子类去实现
     */
    public abstract void operation1();
    public abstract void operation2();

    /**
     * 模板方法，给出逻辑的骨架，而逻辑组成是一些相应的抽象操作，都延迟到子类实现
     */
    public void templateMethod(){
        operation1();
        operation2();
    }
}
