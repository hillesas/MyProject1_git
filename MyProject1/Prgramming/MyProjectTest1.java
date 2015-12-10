package Prgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyProjectTest1 {

	@Test
	public void MyProjectTest() {
		MyJunitClass junit = new MyJunitClass();
		String result = junit.ConCat("Hello","World");
		assertEquals("HelloWorld", result);
	}

}
