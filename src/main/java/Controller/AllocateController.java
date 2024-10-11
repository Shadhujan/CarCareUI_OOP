package Controller;


import Model.Allocate;
import ServiceLayer.AllocateService;

public class AllocateController {

    Allocate EmployeeObj;
    AllocateService service;
    
    public AllocateController()
    {
        service =new AllocateService();
    }

    public Allocate addVehicle(String EID, String EmployeeName,  String JobID) {
        EmployeeObj = new Allocate(EID, EmployeeName, JobID);
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
}
