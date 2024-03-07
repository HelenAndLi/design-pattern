package prototype;

public class WorkExperienceDeep implements Cloneable{

    private String timeDuration;

    private String company;

    private String position;

    public WorkExperienceDeep(String timeDuration, String company, String position){
        this.timeDuration = timeDuration;
        this.company = company;
        this.position = position;
    }

    public String getTimeDuration(){
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration){
        this.timeDuration = timeDuration;
    }

    public String getCompany(){
        return company;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getPosition(){
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }

    @Override
    public String toString(){
        return this.timeDuration + " " + this.company + " " + this.position;
    }

    @Override
    protected WorkExperienceDeep clone() throws CloneNotSupportedException{
        return (WorkExperienceDeep) super.clone();
    }
}
