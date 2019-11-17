package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
@Ignore
public class JunitB4After {
	//before Executing this class this method should be static 
	@BeforeClass
	public static void executeBeforeClass() {
		System.out.println("Before Class");
	}
	//After Executing this class this method should be static 
	@AfterClass
	public static void executeAfterClass() {
		System.out.println("After Class");
	}
	@After
	public void executeAfterCase() {
		System.out.println("After Case ");
	}
	@Before
	public void executeBeforeCase() {
		System.out.println("After Case ");
	}
	
	@Test
	public void TestCase1() {
		System.out.println("TestCase1 ");
		assertEquals("Test", "Test");
	}
	@Ignore
	@Test
	public void TestCase2() {
		System.out.println("TestCase2 ");
		assertEquals(123, "Test2");
	}
}
