package com.university.departments.repository;

import com.university.departments.model.Department;
import com.university.departments.model.Lector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Query("SELECT d.departmentHead FROM Department d JOIN d.departmentHead "
            + "WHERE d.departmentName = :departmentName")
    Lector findDepartmentHead(String departmentName);

    @Query("SELECT AVG(l.salary) FROM Department d JOIN d.lectors l "
            + "WHERE d.departmentName = :departmentName")
    Double getDepartmentAverageSalary(String departmentName);

    @Query("SELECT COUNT(l) FROM Department d JOIN d.lectors l "
            + "WHERE d.departmentName = :departmentName")
    Integer countAllEmployeeInDepartment(String departmentName);
}
