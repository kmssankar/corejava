package org.corejava.junitbg;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

class Arithematic{
	public int sumNumber(int a , int  b) {
		return a+b;
	}
}


@RunWith(Parameterized.class)
public class ParameterizedTest {
	
	private int input1;
	private int input2;
	private int expout;
	
	private Arithematic arithematic;
	
	public ParameterizedTest(int input1, int input2, int expout) {
		super();
		this.input1 = input1;
		this.input2 = input2;
		this.expout = expout;
	}

	@Before
	public void initArith() {
		arithematic = new Arithematic();
	}
	@Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {{1,1,2},{99,1,100}});
	}
	@Test
	public void testParm() {
		assertEquals(expout, arithematic.sumNumber(input1,input2));
	}
	
}
