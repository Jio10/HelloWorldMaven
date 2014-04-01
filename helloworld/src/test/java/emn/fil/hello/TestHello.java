package test.java.emn.fil.hello;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.emn.fil.hello.Hello;

 

public class TestHello{
	Hello hello;

	@Before
	public void setUp() throws Exception {
		hello = new Hello();
	}

	@Test
	public void testHelloWorld()  {
		assertEquals(hello.getStrings(),"Hello World !!");
	}
}
