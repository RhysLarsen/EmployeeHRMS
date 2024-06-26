package com.employee.manage.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.employee.manage.domain.Employee;
import com.employee.manage.service.EmployeeService;
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService eService;

    @GetMapping("/employees")
    public String getEmployees(ModelMap employeeModel) {
        List<Employee> el = eService.getAll();

        for(Employee e:el) {
            System.out.println("emp" + e);
        }
        employeeModel.addAttribute("elist",el);
        return "employees";
    }
}
