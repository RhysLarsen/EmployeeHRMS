package com.employee.manage.service;

import java.util.List;

import com.employee.manage.domain.NonTeachingStaff;

public interface NonTeachStaffService {

    public void addNonTeachStaff(NonTeachingStaff nt);

    public List<NonTeachingStaff> getAll();

    public void deleteNonTeachStaff(Long id);

    public NonTeachingStaff getNonById(Long id);

    public NonTeachingStaff updateNon(NonTeachingStaff n);
}
