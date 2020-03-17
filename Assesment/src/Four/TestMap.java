package Four;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext cont=new ClassPathXmlApplicationContext("Dependent-bean.xml");
		Mapping qump=(Mapping)cont.getBean("qump");
		qump.showAnswers();

	}

}

