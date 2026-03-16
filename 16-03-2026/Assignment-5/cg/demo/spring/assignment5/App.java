package cg.demo.spring.assignment5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("springConfig.xml");

        
        Employee e=(Employee) ac.getBean("emp1");
        e.show();
        
    }
}
