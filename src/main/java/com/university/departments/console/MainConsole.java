package com.university.departments.console;

import com.university.departments.console.impl.DepartmentAverageSalaryCommand;
import com.university.departments.console.impl.EmployeeCountCommand;
import com.university.departments.console.impl.HeadOfDepartmentCommand;
import com.university.departments.console.impl.LectorsGlobalSearchCommand;
import com.university.departments.console.impl.MenuCommand;
import com.university.departments.console.impl.QuitCommand;
import com.university.departments.console.impl.StatisticsCommand;
import com.university.departments.console.impl.WrongCommand;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MainConsole {
    private final Map<String, CommandConsole> handlers = new HashMap<>();

    @Autowired
    public MainConsole(ApplicationContext context) {
        handlers.put("menu", context.getBean(MenuCommand.class));
        handlers.put("1", context.getBean(HeadOfDepartmentCommand.class));
        handlers.put("2", context.getBean(StatisticsCommand.class));
        handlers.put("3", context.getBean(DepartmentAverageSalaryCommand.class));
        handlers.put("4", context.getBean(EmployeeCountCommand.class));
        handlers.put("5", context.getBean(LectorsGlobalSearchCommand.class));
        handlers.put("quit", context.getBean(QuitCommand.class));
    }

    public void run() {
        handlers.get("menu").handle();
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        command(operation);
    }

    public void command(String operation) {
        while (true) {
            if (operation.equals("menu")) {
                handlers.get("menu").handle();
                Scanner scanner = new Scanner(System.in);
                String commandHandler = scanner.nextLine();
                command(commandHandler);
            }
            handlers.getOrDefault(operation, new WrongCommand()).handle();
            operation = "menu";
        }
    }
}
