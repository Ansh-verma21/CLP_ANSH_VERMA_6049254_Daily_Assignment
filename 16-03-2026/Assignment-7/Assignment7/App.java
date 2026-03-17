package Assignment7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("Assignment7.xml");

        
        SBU e=(SBU) ac.getBean("sbu");
        e.show();
        
    }
}
