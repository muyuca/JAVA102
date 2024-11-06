package UniWorkers;

public class Officer extends Workers{
    private String departmant;
    private String shift;
    public Officer (String nameSurname, String telNum, String email,String departmant,String shift){
        super(nameSurname, telNum, email);
        this.departmant=departmant;
        this.shift=shift;
    }
    public String getDepartmant(){
        return this.departmant;
    }
    public String getShift(){
        return this.shift;
    }
    public void setDepartmant(String newDepartmant){
        this.departmant=newDepartmant;
    }
    public void setShift(String newShift){
        this.shift=newShift;
    }

}
