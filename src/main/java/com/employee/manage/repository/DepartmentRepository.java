package com.employee.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manage.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
