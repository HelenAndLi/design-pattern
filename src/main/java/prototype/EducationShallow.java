package prototype;

public class EducationShallow {

    private String timeDuration;

    private String schoolName;

    public EducationShallow(String timeDuration, String schoolName){
        this.timeDuration = timeDuration;
        this.schoolName = schoolName;
    }

    public String getTimeDuration(){
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration){
        this.timeDuration = timeDuration;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    @Override
    public String toString(){
        return this.timeDuration + " " + this.schoolName;
    }

}
