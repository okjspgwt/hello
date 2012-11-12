package net.ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	public void testGetMessage() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage());
	}
}
