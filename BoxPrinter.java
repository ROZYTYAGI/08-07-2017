package generic;

public class BoxPrinter<T,V> {

	private T val1;
	private V val2;
	public BoxPrinter(T arg1,V arg2)
	{
		val1=arg1;
		val2=arg2;
	}
	public String toString()
	{
		return "{"+val1+val2+"}";
	}
	
	
	
}

