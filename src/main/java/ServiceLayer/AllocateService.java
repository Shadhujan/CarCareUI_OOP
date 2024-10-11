/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiceLayer;

/**
 *
 * 
 */

import DatabaseLayer.DatabaseConnection;
import Model.Allocate;

public class AllocateService {
    
    private DatabaseConnection singleConn;
    
    public AllocateService(){
        singleConn = DatabaseConnection.getSingleInstance();
        
    }
    
    public boolean addEmployee(Allocate employee){
    try
    {
        String EID = employee.getEID();
        String EmployeeName = employee.getEmployeeName();
        String JobID = employee.getJobID();
        
        String query="insert into allocatetbl values('"+EID+"','"+EmployeeName+"','"+JobID+"')";
        boolean result=singleConn.ExecuteQuery(query);
        return result;
    }catch (Exception ex)
    {
      System.out.println("Cannot Allocate a employee");
      return false;
    }
};
    public boolean updateEmployee(Allocate employee){
    try
    {
        String EID = employee.getEID();
        String EmployeeName = employee.getEmployeeName();
        String JobID = employee.getJobID();
        String query="UPDATE allocatetbl SET EmployeeName='"+EmployeeName+"', EID='"+EID+"' WHERE JobID='"+JobID+"'";
        boolean result=singleConn.ExecuteQuery(query);
        return result;
    }catch (Exception ex)
        {
          System.out.println("Cannot update the Allocate employee");
          return false;
        }
};

    
}
