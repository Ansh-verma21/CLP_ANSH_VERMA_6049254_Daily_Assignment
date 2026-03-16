package cq.classes.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Assignment6Config.xml");

        
        Employee e=(Employee) ac.getBean("emp1");
        
        e.getSbuDetails();
    }
}
