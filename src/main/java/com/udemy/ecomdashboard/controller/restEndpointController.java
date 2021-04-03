package com.udemy.ecomdashboard.controller;

import com.udemy.ecomdashboard.entity.EmployeeInformation;
import com.udemy.ecomdashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class restEndpointController {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(method = RequestMethod.GET, value = "/employees")
    public List<EmployeeInformation> getAllEmp(){
        return dashboardService.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.POST, value="/employee/add")
    public String saveEmployeeInfo(@RequestBody EmployeeInformation employeeInformation){
        System.out.println(dashboardService.addEmployee((employeeInformation)));
        if(dashboardService.addEmployee(employeeInformation)!= null){
            return "Employee data saved successfully";
        } else{
            return "Error saving employee info";
        }
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/employee/delete")
    public String deleteEmp(@RequestParam(name="empId", required = true) String pk){
        try{
            //Retrieve emp base on pk
            dashboardService.deleteEmployee((dashboardService.getEmployee(pk)));
            return "deleted";
        } catch(Exception e){
            return "error";
        }
    }
}
