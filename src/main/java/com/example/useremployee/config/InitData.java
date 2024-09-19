package com.example.useremployee.config;

import com.example.useremployee.model.Employee;
import com.example.useremployee.model.Gender;
import com.example.useremployee.model.User;
import com.example.useremployee.repositories.EmployeeRepository;
import com.example.useremployee.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class InitData implements CommandLineRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

            User us1 = new User();
            us1.setEmail("erik@aol.com");
            us1.setPassword("erik123");
            userRepository.save(us1);

            us1.setUserID(0);
            us1.setEmail("peter12@outlook.com");
            us1.setPassword("Peter123");
            userRepository.save(us1);

            us1.setUserID(0);
            us1.setEmail("jens12@aol.com");
            us1.setPassword("jens1312");
            userRepository.save(us1);

            Employee emp1 = new Employee();
            emp1.setBorn(LocalDateTime.of(1990, 5, 10,16,10,12));
            emp1.setName("klaus");
            emp1.setGender(Gender.MALE);
            emp1.setVegetarian(true);
            emp1.setUser(us1);
            employeeRepository.save(emp1);
    }




}



