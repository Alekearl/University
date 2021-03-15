package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import com.university.departments.service.DepartmentService;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeCountCommand implements CommandConsole {
    private DepartmentService departmentService;

    @Autowired
    public EmployeeCountCommand(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please, insert department to count employees.");
        Scanner scanner = new Scanner(System.in);
        String departmentName = scanner.nextLine();
        Integer countEmployeesInDepartment = departmentService
                .countEmployeesInDepartment(departmentName);
        System.out.println("Employee count " + countEmployeesInDepartment + ".");
    }
}
