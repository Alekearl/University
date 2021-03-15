package com.university.departments;

import com.university.departments.console.MainConsole;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepartmentsApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication
                .run(DepartmentsApplication.class, args);
        MainConsole mainConsole = new MainConsole(context);
        mainConsole.run();
    }
}
