package generic;

public class PairofCars<T> {
	private T obj1;
	private T obj2;
	PairofCars(T t1,T t2)
	{
		obj1=t1;
		obj2=t2;
	}
	
public T getFirst()
{
	return obj1;
}
public T getSecond()
{
	return obj2;
}
public String toString()
{
	return "{"+obj1+obj2+"}";
}

}
