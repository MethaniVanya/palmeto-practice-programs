package unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JunitTestClass {
	@Before
	public void preMethod()
	{
		System.out.println("this will be exceuted first");
	}

	
	@Test
	public void test2()
	{
		System.out.println("this is my test one");
		
	}
	@Ignore
	@Test
	public void test3()
	{
		System.out.println("this is my stest3");
	}
	@After
	public void postMethod()
	{
		System.out.println("this will execute after");
	}
	
}
