package prototype;

public class PrototypeDemo {

    public static void main(String[] args) throws CloneNotSupportedException{
        Resume r = new Resume("张三");
        r.setInfo("男", "28");
        r.setWorkExperience(new WorkExperienceDeep("2020.03-2024.06", "B公司", "Java开发工程师"));
        r.setEducationShallow(new EducationShallow("2013.09-2017.07", "xx大学"));


        Resume b = r.clone();
        b.setInfo("女", "29");

        Resume c = r.clone();
        c.setWorkExperience(new WorkExperienceDeep("2017.07-", "实习", "学生"));
        c.setEducationShallow(new EducationShallow("2023.07-", "刚毕业"));

        r.display();
        b.display();
        c.display();
        System.out.println();
        System.out.println("=== 浅克隆、深克隆 ===");
        WorkExperienceDeep w = b.getWorkExperience();
        EducationShallow e = b.getEducationShallow();
        c.setWorkExperience(w);
        c.setEducationShallow(e);
        w.setCompany("Hi公司");
        e.setSchoolName("改改");

        r.display();
        b.display();
        c.display();
    }
}
