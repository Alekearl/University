package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import org.springframework.stereotype.Component;

@Component
public class WrongCommand implements CommandConsole {
    @Override
    public void handle() {
        System.out.println("Sorry. Wrong command, please try again.");
    }
}
