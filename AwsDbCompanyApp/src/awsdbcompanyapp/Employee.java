
package awsdbcompanyapp;


public class Employee {
    
    
    private int EmpID;
    private String EmpLname;
    private String EmpFname;
    private String EmpAdress1;
    private String EmpAdress2;
    private String EmpCity;
    private String EmpState;

    public Employee() {    }

    public Employee(int EmpID, String EmpLname, String EmpFname,
            String EmpAdress1, String EmpAdress2, String EmpCity,
            String EmpState) {
        this.EmpID = EmpID;
        this.EmpLname = EmpLname;
        this.EmpFname = EmpFname;
        this.EmpAdress1 = EmpAdress1;
        this.EmpAdress2 = EmpAdress2;
        this.EmpCity = EmpCity;
        this.EmpState = EmpState;
    }

    public int getEmpID() {
        return EmpID;
    }

    public String getEmpLname() {
        return EmpLname;
    }

    public String getEmpFname() {
        return EmpFname;
    }

    public String getEmpAdress1() {
        return EmpAdress1;
    }

    public String getEmpAdress2() {
        return EmpAdress2;
    }

    public String getEmpCity() {
        return EmpCity;
    }

    public String getEmpState() {
        return EmpState;
    }

    public void setEmpID(int EmpID) {
        this.EmpID = EmpID;
    }

    public void setEmpLname(String EmpLname) {
        this.EmpLname = EmpLname;
    }

    public void setEmpFname(String EmpFname) {
        this.EmpFname = EmpFname;
    }

    public void setEmpAdress1(String EmpAdress1) {
        this.EmpAdress1 = EmpAdress1;
    }

    public void setEmpAdress2(String EmpAdress2) {
        this.EmpAdress2 = EmpAdress2;
    }

    public void setEmpCity(String EmpCity) {
        this.EmpCity = EmpCity;
    }

    public void setEmpState(String EmpState) {
        this.EmpState = EmpState;
    }

    @Override
    public String toString() {
        return this.EmpID + "\t" + this.EmpLname + "\t" + this.EmpFname + 
                "\t" + this.EmpAdress1 + "\t" + this.EmpAdress2 + "\t" + 
                this.EmpCity + "\t" + this.EmpState;
    }
    
    
    
    
    
}
