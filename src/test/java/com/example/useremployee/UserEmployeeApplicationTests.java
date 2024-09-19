package com.example.useremployee;

import com.example.useremployee.model.Employee;
import com.example.useremployee.repositories.EmployeeRepository;
import com.example.useremployee.repositories.UserRepository;
import org.hibernate.JDBCException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserEmployeeApplicationTests {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    UserRepository userRepository;

    @Test
    void testAtLeastOneJens() {
        List<Employee> lst = employeeRepository.findEmployeeByName("klaus");
        assertTrue(lst.size()>0);
    }

    @Test
    void testDeleteEmployee(){
        List<Employee> lst = employeeRepository.findEmployeeByName("klaus");
        Employee emp1 = lst.get(0);
        assertEquals("klaus", emp1.getName());
        assertThrows( org.springframework.dao.DataIntegrityViolationException.class, () -> userRepository.delete(emp1.getUser()));
    }

}
