package core;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Divide3ParameterizedTest {

	@org.junit.BeforeClass 
	public static void BeforeClass() {System.out.println ("Come on, Baby! Divide (/) 3 params.");}
	@org.junit.AfterClass
	public static void AfterClass() {System.out.println ("Eah, Baby, Eahhhhhh!");}
	
	
	
	@Parameters(name = "Parameter # {index}: {1} / {2} / {3} = {0}")
	public static Collection<Double[]> divideNumbers() {
		return Arrays.asList(new Double[][] {
			{ 15.0, 90.0, 2.0, 3.0},  // { 0.5, 1.0, 2.0 }, 
			{ 3.33, 30.0, 3.0, 3.0},  // { 0.66, 2.0, 3.0 }, 
			{ 4.25, 51.0, 4.0, 3.0},  // { 0.75, 3.0, 4.0 }, 
			{ 6.5, 39.0, 2.0, 3.0},  // { 0.8, 4.0, 5.0 },
		});}
	
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double thrid;
	@Test(timeout = 1000) // @Ignore
	
		public void divide() {
		
		System.out.println(first + " / " + second + " / " + thrid + " = " + expected);
		assertEquals("Not correct", Calculator.divide(first, second, thrid), expected, 0.09);
				}
			}