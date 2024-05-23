package com.employee.manage.service;


import java.util.List;

import com.employee.manage.domain.AdminStaff;

public interface AdminStaffService {

    public void addAdminStaff(AdminStaff adminStaff);

    public List<AdminStaff> getAll();

    public void deleteAdminStaff(Long id);

    public AdminStaff getAdminById(Long id);

    public AdminStaff updateAdmin(AdminStaff adminStaff);
}
