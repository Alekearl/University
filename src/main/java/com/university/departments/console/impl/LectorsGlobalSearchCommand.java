package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import com.university.departments.model.Lector;
import com.university.departments.service.LectorService;
import java.util.List;
import java.util.Scanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LectorsGlobalSearchCommand implements CommandConsole {
    private final LectorService lectorService;

    @Autowired
    public LectorsGlobalSearchCommand(LectorService lectorService) {
        this.lectorService = lectorService;
    }

    @Override
    public void handle() {
        System.out.println("Please, insert template to search lector.");
        Scanner scanner = new Scanner(System.in);
        String templateName = scanner.nextLine();
        List<Lector> lectors = lectorService.getLectorsByName(templateName);
        for (Lector lector : lectors) {
            System.out.println(lector.getName());
        }
    }
}
