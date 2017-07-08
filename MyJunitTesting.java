package Testing;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

//import junit.framework.TestCase;

public class MyJunitTesting {
	EvenTesting jt;

	@Before
	public void sst() {
		System.out.println("Tyagi");
		jt = new EvenTesting();
	}

	@Test
	public void testCheckEven(){
		Assert.assertTrue(jt.checkEven(2));// always start function with test for testing test case
	}

	@Test
	public void testCheckEvenNegative() throws IOException {
		Assert.assertTrue(!jt.checkEven(1));
	}

	@Test
	public void testSum() {
		Assert.assertTrue(jt.sum(2, 3) == 5);
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testArray() {
		jt.array();
	}
	@Test
public  void testSub()
{
		String user="Riya";
Assert.assertEquals(user, jt.getMessage());
	
System.out.println("True");
}
	@After
	public void testSecond() {
		System.out.println("Rozy");
		jt = null;
	}
	@BeforeClass
	public static void testSec() {
		System.out.println("Rozy Tyagi");
		
	}
	@AfterClass
	public static void testSecon() {
		System.out.println("Rozy");
		
}
}