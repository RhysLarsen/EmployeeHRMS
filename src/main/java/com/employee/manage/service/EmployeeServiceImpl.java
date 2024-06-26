package com.employee.manage.service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.manage.domain.Department;
import com.employee.manage.domain.Employee;
import com.employee.manage.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository eRepo;

    @Override
    public List<Employee> getEmployeeByDeptid(Department d){

        return eRepo.findByDepartment(d);
    }

    @Override
    public Employee getEmployeeById(Long id) {

        Optional<Employee> ob = eRepo.findById(id);

        return ob.get();
    }

    @Override
    public List<Employee> getAll() {
        return eRepo.findAll();
    }



}
