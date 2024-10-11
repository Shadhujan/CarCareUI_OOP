
package Controller;

import Model.Vehicle;
import ServiceLayer.CustomerOrderService;

public class VehicleController {

    Vehicle VehicleObj;

    CustomerOrderService service;

    public VehicleController() {
        service = new CustomerOrderService();
    }

    public Vehicle addVehicle(String VID, String CoustomerName, String CustomerID, String CustomerMail, int Quantity, double VPrice) {
        VehicleObj = new Vehicle(VID, CoustomerName, CustomerID, CustomerMail, Quantity, VPrice);
        return VehicleObj;
    }

    public boolean addCustomerToDatabase() {
        return service.addCustomer(VehicleObj);
    }

    public boolean updateCustomerInDatabase() {
        return service.updateCustomer(VehicleObj);
    }

    public boolean deleteCustomerFromDatabase() {
        return service.deleteCustomer(VehicleObj);
    }
}
