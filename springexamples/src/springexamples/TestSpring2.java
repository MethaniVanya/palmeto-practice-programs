package springexamples;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpring2 {
	public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("beans3.xml");
	Person p=(Person) context.getBean("per");
	p.showData();
	Address a=(Address)context.getBean("addr");
	System.out.println(a);
	}
}
