package springexamples;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
public class initBeans implements BeanFactoryPostProcessor
{
   public Object postProcessBeforeInitialization(Object bean,String beanName)
    throws BeanCreationException
    {
	   System.out.println("before initialization");
	   return bean;
    }
   public Object postProcessAfterInitialization(Object bean,String beanName)
   throws BeansException
   {
	   System.out.println("after intialization");

   return bean;
   }
}
