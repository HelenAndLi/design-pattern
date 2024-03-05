package prototype;

public class PrototypeDemo {

    public static void main(String[] args){
        Resume r = new Resume("张三");
        r.setInfo("男","28");
        r.setWorkExperience("2017-2020年，在A公司任Java开发工程师；2020-2024年，在B公司任Java开发工程师");


        Resume b = (Resume) r.clone();
        b.setInfo("女","29");

        Resume c = (Resume) r.clone();
        c.setWorkExperience("刚毕业");

        r.display();
        b.display();
        c.display();
    }
}
