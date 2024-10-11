/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author shadhujan
 */
import Model.Employee;
import ServiceLayer.EmployeeService;
import java.util.ArrayList;

public class EmployeeController {
    Employee EmployeeObj;
    //
    EmployeeService service;
    
    public EmployeeController()
    {
        service =new EmployeeService();
    }

    //
    public Employee addEmployee(String EID, String EmployeeName,  String Email) {
        EmployeeObj = new Employee(EID, EmployeeName, Email);
        return EmployeeObj;
    }
    
    public boolean addEmployeeToDatabase()
    {
        return service.addEmployee(EmployeeObj);
    }
    
    public boolean updateEmployeeInDatabase()
    {
        return service.updateEmployee(EmployeeObj);
    }

    public boolean deleteEmployeeFromDatabase()
    {
        return service.deleteEmployee(EmployeeObj);
    }
    
//    public ArrayList<Employee> getAllEmployees() {
//    return service.getAllEmployees();
//}
    
//    public boolean retriveEmployeeFromDatabase()
//    {
//        return service.retriveEmployee(EmployeeObj);
//    }
}
