/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Model.Employee;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author shadhujan
 */
public class EmployeeService {
    
    private DatabaseConnection singleConn;
    
    public EmployeeService(){
        singleConn = DatabaseConnection.getSingleInstance();
        
    }
    
    public boolean addEmployee(Employee employee){
    try
    {
        String EID = employee.getEID();
        String EmployeeName = employee.getEmployeeName();
        String Email = employee.getEmail();
        
        String query="insert into emptbl values('"+EID+"','"+EmployeeName+"','"+Email+"')";
        boolean result=singleConn.ExecuteQuery(query);
        return result;
    }catch (Exception ex)
    {
      System.out.println("Cannot insert a employee");
      return false;
    }
};
    public boolean updateEmployee(Employee employee){
    try
    {
        String EID = employee.getEID();
        String EmployeeName = employee.getEmployeeName();
        String Email = employee.getEmail();
        
        String query="UPDATE emptbl SET EmployeeName='"+EmployeeName+"', Email='"+Email+"' WHERE EID='"+EID+"'";
        boolean result=singleConn.ExecuteQuery(query);
        return result;
    }catch (Exception ex)
        {
          System.out.println("Cannot update the employee");
          return false;
        }
};

    public boolean deleteEmployee(Employee employee){
        try
        {
            String EID = employee.getEID();

            String query="DELETE FROM emptbl WHERE EID='"+EID+"'";
            boolean result=singleConn.ExecuteQuery(query);
            return result;
        }catch (Exception ex)
        {
          System.out.println("Cannot delete the employee");
          return false;
        }
};
    
//    public ArrayList<Employee> getAllEmployees() {
//    ArrayList<Employee> employees = new ArrayList<>();
//    try {
//        String query = "SELECT * FROM emptbl";
//        ResultSet rs = singleConn.ExecuteSelectQuery(query);
//        while (rs.next()) {
//            String EID = rs.getString("EID");
//            String EmployeeName = rs.getString("EmployeeName");
//            String Email = rs.getString("Email");
//            Employee employee = new Employee(EID, EmployeeName, Email);
//            employees.add(employee);
//        }
//    } catch (Exception ex) {
//        System.out.println("Cannot retrieve employees");
//    }
//    return employees;
//}

//    public boolean retriveEmployee(Employee employee){
//        try
//        {
//            String EID = employee.getEID();
//
//            String query="SELECT Email FROM emptbl WHERE EID='"+EID+"'";
//            boolean result=singleConn.ExecuteQuery(query);
//            return result;
//        }catch (Exception ex)
//        {
//          System.out.println("Cannot retrive the employee");
//          return false;
//        }
//};
//    public String getRetriveEmployee(Employee employee){
//    String EID = employee.getEID();
//    String query="SELECT Email FROM emptbl WHERE EID='"+EID+"'";
//    ResultSet rs = singleConn.ExecuteSelectQuery(query);
//    try {
//        if(rs.next()) {
//            return rs.getString("Email");
//        } else {
//            return null; // or some default value
//        }
//    } catch (SQLException ex) {
//        System.out.println("Cannot retrieve employee email");
//        return null; // or some default value
//    }
//};

    
}
