package com.employee.manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.manage.domain.AdminStaff;

@Repository
public interface AdminStaffRepository extends JpaRepository<AdminStaff, Long> {
}
