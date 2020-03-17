package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class HelloWorldConfig
{	
	@Bean
	public HelloWorld1 helloworld()
	{
		return new HelloWorld1();
	}
	@Bean
	public Employee emp()
	{
	return new Employee("844344", "monica");
	}
}
