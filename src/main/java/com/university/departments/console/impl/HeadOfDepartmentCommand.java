package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import com.university.departments.service.DepartmentService;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HeadOfDepartmentCommand implements CommandConsole {
    private final DepartmentService departmentService;

    @Autowired
    public HeadOfDepartmentCommand(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        System.out.println("Please, insert department to find departmentHead.");
        Scanner scanner = new Scanner(System.in);
        String departmentName = scanner.nextLine();
        try {
            String departmentHeadName = departmentService
                    .getLDepartmentHead(departmentName).getName();
            System.out.println("Head of " + departmentName
                    + " department is " + departmentHeadName + ".");
        } catch (NullPointerException e) {
            throw new RuntimeException("Sorry, can't find department head.");
        }
    }
}
