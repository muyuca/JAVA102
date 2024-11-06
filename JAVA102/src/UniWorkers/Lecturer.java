package UniWorkers;

public class Lecturer extends academician{
    private String gateNo;
    public Lecturer(String nameSurname,String telNum,String email,String section,String title,String gateNo) {
        super(nameSurname, telNum, email, section, title);
        this.gateNo=gateNo;
    }

    public String getGateNo() {
        return gateNo;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

}
