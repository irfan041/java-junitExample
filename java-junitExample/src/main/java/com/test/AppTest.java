package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.App;

public class AppTest {

	 App app=new App();
	@Test
	public void testProcess() {
		//fail("Not yet implemented");
		assertEquals(app.process("hello"), "HELLO");
	}
	
	@Test
	public void testProcess1() {
		//fail("Not yet implemented");
		assertEquals(app.process("he"), "hi");
	}

}
