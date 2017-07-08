package generic;

import java.util.List;
import java.util.ArrayList;

public class UtilitiesTest {
	public static void main(String a[])
	{
		List<Integer> intlist=new ArrayList<Integer>();
		intlist.add(10);
		intlist.add(20);
		System.out.println("the original list is:" +intlist);
		Utilities.fill(intlist, 100);
		System.out.println(intlist);
		GenricMethodException<Car, Car>value4 = new GenricMethodException<Car, Car>();
		value4.assignCar(new Car("abc","fgrf","iji"),new Car("abc","fgrf","iji"));
		System.out.println(value4);
	}
	}


