package templateMethod;

public class Paper {

    public void question1(){
        String str = "这个是问题1，描述了一堆，选[ ]\na.A答案\tb.B答案\nc.C答案\td.D答案";
        String right = answer1();
        System.out.println(str);
        System.out.println(right);
    }

    public void question2(){
        String str = "这个是问题2，描述了一堆，选[ ]\na.A答案\tb.B答案\nc.C答案\td.D答案";
        String right = answer2();
        System.out.println(str);
        System.out.println(right);
    }

    public void question3(){
        String str = "这个是问题3，描述了一堆，选[ ]\na.A答案\tb.B答案\nc.C答案\td.D答案";
        String right = answer3();
        System.out.println(str);
        System.out.println(right);
    }

    public String answer1(){
        return "";
    }

    public String answer2(){
        return "";
    }

    public String answer3(){
        return "";
    }

}
