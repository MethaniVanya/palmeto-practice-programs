package unittesting;

import org.junit.Assert.assertEquals;
import org.junit.Test;



public class TestMessage {

	@Test
	public void test1()
	{
		HelloWorld hw= new HelloWorld();
		Assert.assertEquals("Message1",hw.message1());
	}
}
