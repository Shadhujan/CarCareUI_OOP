package Model;

public class Vehicle {

    private String VID;
    private String CoustomerName;
    private String CustomerID;
    private String CustomerMail;
    private int Quantity;
    private double VPrice;
    private double Total;

    public Vehicle(String VID, String CoustomerName, String CustomerID, String CustomerMail, int Quantity, double VPrice) {
        this.VID = VID;
        this.CoustomerName = CoustomerName;
        this.CustomerID = CustomerID;
        this.CustomerMail = CustomerMail;
        this.Quantity = Quantity;
        this.VPrice = VPrice;
    }

    public double CalTotal() {
        Total = this.VPrice * this.Quantity;
        return Total;
    }

    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public String getCoustomerName() {
        return CoustomerName;
    }

    public void setCoustomerName(String CoustomerName) {
        this.CoustomerName = CoustomerName;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String CustomerID) {
        this.CustomerID = CustomerID;
    }

    public String getCustomerMail() {
        return CustomerMail;
    }

    public void setCustomerMail(String CustomerMail) {
        this.CustomerMail = CustomerMail;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public double getVPrice() {
        return VPrice;
    }

    public void setVPrice(double VPrice) {
        this.VPrice = VPrice;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "VID=" + VID + ", CoustomerName=" + CoustomerName + ", CustomerID=" + CustomerID + ", Quantity=" + Quantity + ", VPrice=" + VPrice + ", Total=" + Total + '}';
    }

    
}
