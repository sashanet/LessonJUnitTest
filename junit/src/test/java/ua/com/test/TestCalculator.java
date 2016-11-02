package ua.com.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ua.com.lesson.Calculator;

public class TestCalculator {

	private static Calculator calculator;
	
	@BeforeClass
	public static void init(){
		calculator = new Calculator(); 
	}
	
	@AfterClass
	public static void destroy(){
		calculator= null;
		}
	
	@Test
	public void testAdd(){
		int expected = calculator.add(5, 5);
		int real =10;
		
		Assert.assertEquals(expected, real);
		
		
	}
	
//	@Ignore
	@Test
	public void testSustruct(){
		Assert.assertEquals(calculator.substruct(5, 2), 3, 0.1);
	}
	
	@Test
	public void testMult(){
		Assert.assertEquals(calculator.multiply(3, 3), 9);
	}
	@Test
	public void testDevide(){
		Assert.assertEquals(calculator.devide(10, 3), 3.3, 0.1);
	} 
	
	@Before
	public void before(){
		System.out.println("before");
	}
	
	
}
