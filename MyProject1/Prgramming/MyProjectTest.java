package Prgramming;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyProjectTest {

	@Test
	public void MyJunitTest() {
		MyJunitClass junit = new MyJunitClass();
		int result = junit.add(100, 200);
		assertEquals(300, result); 
	}
			
	}

