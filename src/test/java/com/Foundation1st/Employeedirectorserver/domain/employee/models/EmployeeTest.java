package com.Foundation1st.Employeedirectorserver.domain.employee.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest(){
        Employee employee = new Employee("Demo","user","123.com");
        employee.setId(1L);

        String expected = "1 Demo user 123.com";
        String actual = employee.toString();

        Assertions.assertEquals(expected, actual);
    }
}
