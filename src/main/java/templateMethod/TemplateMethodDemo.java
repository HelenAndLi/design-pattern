package templateMethod;

public class TemplateMethodDemo {

    public static void main(String[] args){
        System.out.println("同学甲抄的试卷：");
        Paper a = new PaperA();
        a.question1();
        a.answer1();
        a.question2();
        a.answer2();
        a.question3();
        a.answer3();

        System.out.println("同学乙抄的试卷：");
        Paper b = new PaperB();
        b.question1();
        b.answer1();
        b.question2();
        b.answer2();
        b.question3();
        b.answer3();
    }
}
