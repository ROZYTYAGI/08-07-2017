package generic;

public class DimondCase<T, U> {
	private T t1;
	private U u1;
	public  DimondCase(T t,U u)
	{
		super();
		t1= t;
		u1=u;
	}
public void print()
{
	System.out.println(t1);
	System.out.println(u1);
	
}

}
