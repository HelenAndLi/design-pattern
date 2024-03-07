package templateMethod;

public class PaperA extends Paper {

    @Override
    public String answer1(){
        return "选d。";
    }

    @Override
    public String answer2(){
        return "选c。";
    }

    @Override
    public String answer3(){
        return "选b。";
    }
}
