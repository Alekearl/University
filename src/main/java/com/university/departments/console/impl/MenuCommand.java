package com.university.departments.console.impl;

import com.university.departments.console.CommandConsole;
import org.springframework.stereotype.Component;

@Component
public class MenuCommand implements CommandConsole {
    @Override
    public void handle() {
        String menu = "Commands to insert:\n"
                + "\"menu\" - shows menu\n"
                + "\"1\" - get head of department\n"
                + "\"2\" - get department statistic\n"
                + "\"3\" - get department average salary\n"
                + "\"4\" - get department employees count\n"
                + "\"5\" - get global search by template\n"
                + "\"quit\" - means exit program";
        System.out.println(menu);
    }
}
