package test;

import beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        Nested beans means declaring a bean inside another bean and it's not about Inner Classes. It is a way of
        creating object for another bean purposefully. 
         */
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
        Employee emp1 = (Employee) context.getBean("emp1");
        emp1.getEmployeeDetails();
    }
}
