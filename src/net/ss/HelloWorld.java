package net.ss;

public class HelloWorld {

	public String getMessage() {
		return "Hello World";
	}

	public String getMessage(String name) {
		if (name == null) return getMessage();
		return "Hello " + name;
	}

}
