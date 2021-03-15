package com.university.departments.service.impl;

import com.university.departments.model.Lector;
import com.university.departments.repository.DepartmentRepository;
import com.university.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository repository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Lector getLDepartmentHead(String departmentHead) {
        return repository.findDepartmentHead(departmentHead);
    }

    @Override
    public Double departmentAverageSalary(String departmentName) {
        return repository.getDepartmentAverageSalary(departmentName);
    }

    @Override
    public Integer countEmployeesInDepartment(String departmentName) {
        return repository.countAllEmployeeInDepartment(departmentName);
    }
}
