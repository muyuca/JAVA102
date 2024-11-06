package UniWorkers;

public class academician extends Workers{
    private String section;
    private String title;
    public academician(String nameSurname, String telNum, String email,String section,String title){
        super(nameSurname, telNum, email);
        this.section=section;
        this.title=title;
    }
    public String getSection(){
        return this.section;
    }
    public String getTitle(){
        return this.title;
    }
    public void setSection(String newSection){
        this.section=newSection;
    }
    public void setTitle(String newTitle){
        this.title=newTitle;
    }
}
