package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import org.springframework.stereotype.Component;

@Component
public class QuitCommand implements CommandConsole {
    @Override
    public void handle() {
        System.out.println("Bye. Have a nice day!");
        System.exit(0);
    }
}
