package com.employee.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manage.domain.TeachingStaff;


@Repository
public interface TeachStaffRepository extends JpaRepository<TeachingStaff, Long> {

}
