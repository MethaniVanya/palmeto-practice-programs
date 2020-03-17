package springexamples;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ClassPathResource cps=new ClassPathResource("beans.xml");
 XmlBeanFactory  factory =new XmlBeanFactory(cps);
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
		//obj.getMessage();
		//obj.display();
		Employee e=(Employee) factory.getBean("emp");
		e.displayemp();
	}

}
