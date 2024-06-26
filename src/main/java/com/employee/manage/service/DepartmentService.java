package com.employee.manage.service;


import java.util.List;

import com.employee.manage.domain.Department;


public interface DepartmentService {

    public void addDepartment(Department department);
    public Department getDepartment(Long id);

    public List<Department> getDepartments();
    public void deleteDepartment(Long id);
    public Department updateDepartment(Department d);
}
