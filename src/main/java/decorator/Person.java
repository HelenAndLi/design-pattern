package decorator;

public class Person {

    public Person(){}
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.print("装扮" + name);
        System.out.println();
    }
}
