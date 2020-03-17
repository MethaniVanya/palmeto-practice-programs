package configs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	
	public static void main(String[] args)
	{
		ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld1 helloworld=context.getBean(HelloWorld1.class);
		helloworld.setMessage("helloworld");
		helloworld.getMessage();
		helloworld.showData();
		Employee emp =context.getBean(Employee.class);
		emp.showEmp();
	}
}
