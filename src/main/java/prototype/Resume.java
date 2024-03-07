package prototype;

public class Resume implements Cloneable {

    private String name;

    private String gender;

    private String age;

    private WorkExperienceDeep workExperience;

    private EducationShallow educationShallow;

    public Resume(String name){
        this.name = name;
    }

    public void setInfo(String gender, String age){
        this.gender = gender;
        this.age = age;
    }

    public void setWorkExperience(WorkExperienceDeep workExperience) throws CloneNotSupportedException{
        this.workExperience = workExperience.clone();
    }

    public void setEducationShallow(EducationShallow educationShallow) throws CloneNotSupportedException{
        this.educationShallow = educationShallow;
    }

    public WorkExperienceDeep getWorkExperience(){
        return this.workExperience;
    }
    public EducationShallow getEducationShallow(){
        return this.educationShallow;
    }

    public void display(){
        System.out.println("基本信息 " +  this.name + " " + this.gender + " " + this.age);
        System.out.println("教育经历（浅克隆） " + this.educationShallow);
        System.out.println("工作经历（深克隆） " + this.workExperience);
    }

    @Override
    public Resume clone() throws CloneNotSupportedException{
        return (Resume) super.clone();
    }

}
