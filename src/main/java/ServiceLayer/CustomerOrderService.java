package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Vehicle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerOrderService {

    private DatabaseConnection singleConn;

    public CustomerOrderService(){
        singleConn=DatabaseConnection.getSingleInstance();
    }

    public boolean addCustomer(Vehicle vehicle) {
        try
        {
            String VID=vehicle.getVID();
            String CoustomerName=vehicle.getCoustomerName();
            String  CustomerID=vehicle.getCustomerID();
            String CustomerMail=vehicle.getCustomerMail();
            int Quantity=vehicle.getQuantity();
            double VPrice=vehicle.getVPrice();
            double Total=vehicle.getTotal();

            String query="insert into  cusordertbl values('"+CoustomerName+"','"+CustomerID+"','"+CustomerMail+"','"+VID+"','"+VPrice+"','"+Quantity+"','"+Total+"')";
            boolean result=singleConn.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
            System.out.println("Cannot Add a customer");
            return false;
        }
    };

    public boolean updateCustomer(Vehicle vehicle){
        try
        {
            String VID=vehicle.getVID();
            String CoustomerName=vehicle.getCoustomerName();
            String  CustomerID=vehicle.getCustomerID();
            String CustomerMail=vehicle.getCustomerMail();
            int Quantity=vehicle.getQuantity();
            double VPrice=vehicle.getVPrice();
            double Total=vehicle.getTotal();

            String query="UPDATE cusordertbl values('"+CoustomerName+"','"+CustomerID+"','"+CustomerMail+"','"+VID+"','"+VPrice+"','"+Quantity+"','"+Total+"')";
            boolean result= singleConn.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
            System.out.println("Cannot upaadte Customer");
            return false;
        }
    };

    public boolean deleteCustomer(Vehicle vehicle){
        try
        {

            String  CustomerID=vehicle.getCustomerID();

            String query="DELETE FROM cusordertbl WHERE CusID='"+CustomerID+"'";
            boolean result= singleConn.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
            System.out.println("Cannot Delete the Customer");
            return false;
        }
    }
}
