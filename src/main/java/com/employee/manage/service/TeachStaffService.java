package com.employee.manage.service;

import java.util.List;

import com.employee.manage.domain.TeachingStaff;


public interface TeachStaffService {

    public void addTeachStaff(TeachingStaff ts);

    public List<TeachingStaff> getAll();

    public void deleteTeachStaff(Long id);

    public TeachingStaff getTeachById(Long id);

    public TeachingStaff updateTeach(TeachingStaff ts);
}
