package com.employee.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manage.domain.NonTeachingStaff;

@Repository
public interface NonTeachStaffRepository extends JpaRepository<NonTeachingStaff, Long>{

}
