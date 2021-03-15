package com.university.departments.service;

import com.university.departments.model.Lector;

public interface DepartmentService {
    Lector getLDepartmentHead(String departmentHead);

    Double departmentAverageSalary(String departmentName);

    Integer countEmployeesInDepartment(String departmentName);
}
