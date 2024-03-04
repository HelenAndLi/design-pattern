package decorator;

public class PersonDemo {

    public static void main(String[] args){
        Person person = new Person("小王");
        System.out.println("装扮1：");
        Sweatshirt sweatshirt = new Sweatshirt();
        Jeans jeans = new Jeans();
        Sneakers sneakers = new Sneakers();

        sweatshirt.decorate(person);
        jeans.decorate(sweatshirt);
        sneakers.decorate(jeans);
        sneakers.show();

        System.out.println("装扮2：");
        Suit suit = new Suit();
        Tie tie = new Tie();
        LeatherShoes leatherShoes = new LeatherShoes();

        suit.decorate(person);
        tie.decorate(suit);
        leatherShoes.decorate(tie);
        leatherShoes.show();
    }
}
