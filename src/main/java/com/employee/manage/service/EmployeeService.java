package com.employee.manage.service;



import java.util.List;

import com.employee.manage.domain.Department;
import com.employee.manage.domain.Employee;



public interface EmployeeService {

    Employee getEmployeeById(Long id);

    List<Employee> getEmployeeByDeptid(Department d);

    List<Employee> getAll();
}
