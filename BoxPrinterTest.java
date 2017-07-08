package generic;

public class BoxPrinterTest {
	public static void main(String args[]) {
		/*
		 * BoxPrinter<Integer> value1=new BoxPrinter<Integer>(new Integer(10));
		 * System.out.println(value1); BoxPrinter<String> value2=new
		 * BoxPrinter<String>("Hello"); System.out.println(value2);
		 * 
		 * 
		 * Car<String> value3=new Car<String>("abc", "hdi", "uhdiudh");
		 * System.out.println(value3);
		 */

		BoxPrinter<String, Car> value4 = new BoxPrinter<String, Car>("abc", new Car("Audi", "A2", "hgbvf"));
		System.out.println(value4);
		BoxPrinter<Car, Car> value5 = new BoxPrinter(new Car("Audi", "A2", "hgbvf"), new Car("Audi", "A2", "hgbvf"));
		System.out.println(value4);
		
		
		
	}
}
