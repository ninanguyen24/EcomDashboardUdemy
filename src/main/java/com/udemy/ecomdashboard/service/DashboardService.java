package com.udemy.ecomdashboard.service;

import com.udemy.ecomdashboard.entity.*;

import java.util.HashMap;
import java.util.List;

public interface DashboardService {
    HashMap<String,Object> getTodayRevenueDash();

    List<ProductCategory> getBestCategory();

    List<OrderReceived> getAllOrderReceived();

    List<OrderCollectionStatus> getOrderCollection();

    List<EmployeeInformation> getAllEmployee();

    EmployeeInformation getEmployee(final String pk);

    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

    void deleteEmployee(EmployeeInformation employeeInformation);

}
