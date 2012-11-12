package net.ss;

import junit.framework.TestCase;

public class HelloTest extends TestCase {
	public void testGetMessage() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage());
	}
	
	public void testGetMessageWithName() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Steve", hello.getMessage("Steve"));
	}
	
	public void testGetMessageWithNameOther() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello Jobs", hello.getMessage("Jobs"));
	}

	public void testGetMessageWithNameNull() throws Exception {
		HelloWorld hello = new HelloWorld();
		assertEquals("Hello World", hello.getMessage(null));
	}
}
