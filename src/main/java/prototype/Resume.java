package prototype;

import java.io.Closeable;
import java.io.IOException;

public class Resume implements Cloneable{

    private String name;

    private String gender;

    private String age;

    private String workExperience;

    public Resume(String name){
        this.name = name;
    }

    public void setInfo(String gender, String age){
        this.gender = gender;
        this.age = age;
    }

    public void setWorkExperience(String workExperience){
        this.workExperience = workExperience;
    }

    public void display(){
        System.out.println("姓名：" + this.name + "，性别：" + this.gender + "，年龄：" + this.age);
        System.out.println("工作经历：" + this.workExperience);
    }

    public Object clone(){
        return this.clone();
    }

}
