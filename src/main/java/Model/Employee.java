package Model;

public class Employee {

    private String EID;
    private String EmployeeName;
    private String Email;


    public Employee(String EID, String EmployeeName, String Email) {
        this.EID = EID;
        this.EmployeeName = EmployeeName;
        this.Email = Email;
    }

    public String getEID() {
        return EID;
    }

    public void setEID(String EID) {
        this.EID = EID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }


}
