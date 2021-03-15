package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import com.university.departments.service.DepartmentService;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DepartmentAverageSalaryCommand implements CommandConsole {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentAverageSalaryCommand(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please, insert department to count average salary.");
        Scanner scanner = new Scanner(System.in);
        String departmentName = scanner.nextLine();
        Double salary = departmentService.departmentAverageSalary(departmentName);
        System.out.println("The average salary of " + departmentName
                + " is " + salary + ".");
    }
}
