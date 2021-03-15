package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import com.university.departments.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatisticsCommand implements CommandConsole {
    private final DepartmentService departmentService;

    @Autowired
    public StatisticsCommand(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @Override
    public void handle() {
        
    }
}
