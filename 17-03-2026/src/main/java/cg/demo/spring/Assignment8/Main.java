package cg.demo.spring.Assignment8;

import java.util.*;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;



/**
 * Hello world!
 */
public class Main {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	AbstractApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
    	ac.registerShutdownHook();
		EmployeeService es = ac.getBean(EmployeeService.class);
		int choice;
		do {
			
		
		System.out.println("1:insert");
		System.out.println("2:fetch by id");
		System.out.println("3:delete by id");
		System.out.println("4:Fetch all");
		System.out.println("5: terminate");
		System.out.println("Enter choice");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter eid");
			int eid=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter salary");
			double sal=sc.nextDouble();
			es.insert(eid, name, sal);
			break;
		case 2:
			System.out.println("Enter id");
			int sid=sc.nextInt();
			es.getId(sid);
			break;
		case 3:
			System.out.println("Enter id");
			int sid1=sc.nextInt();
			es.delete(sid1);
			break;
		case 4:
			List<Employee> e=es.fetchAll();
			for(Employee emp:e)
			{
				System.out.println(emp);
			}
			break;
			
		case 5:
			System.out.println("Terminate");
			break;
		default:
			System.out.println("Invalid");
			
			
			
		
		}
		}
		while(choice!=5);
		
		
		
		
    }
}
