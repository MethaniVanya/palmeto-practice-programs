package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowiring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("autowire.xml");
		EmloyeeBean emloyee=(EmloyeeBean)context.getBean("employee");
		System.out.println(emloyee.getFullname());
		System.out.println(emloyee.getDepartmentBean().getName());
  }
}
