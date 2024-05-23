package com.employee.manage.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manage.domain.Department;
import com.employee.manage.domain.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List <Employee> findByDepartment(Department d);


}
