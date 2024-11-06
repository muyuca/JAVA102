package UniWorkers;

public class Workers {
    private String nameSurname;
    private String telNum;
    private String email;

    public Workers(String nameSurname,String telNum, String email){
        this.nameSurname=nameSurname;
        this.telNum=telNum;
        this.email=email;

    }
    public String getNameSurname(){
        return this.nameSurname;
    }
    public String getTelNum(){
        return this.telNum;
    }
    public String getEmail(){
        return this.email;
    }
    public void setNameSurname(String newNameSurname){
        this.nameSurname=newNameSurname;
    }
    public void setTelNum(String newTelNumber){
        this.telNum=newTelNumber;
    }
    public void setEmail(String newEmail){
        this.email=newEmail;
    }
    public void enter(){
        System.out.println(this.nameSurname + "Entered the university ");
    }
    public void exit(){
        System.out.println(this.nameSurname+ " Exit the university ");
    }
    public void foodLab(){
        System.out.println(this.nameSurname + "entered the foodlab");
    }


}
