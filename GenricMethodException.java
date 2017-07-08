package generic;

import java.util.Map;
import java.util.HashMap;

public class GenricMethodException<T, U> 
{
	public<T,U> void assignCar(T t,U u)
	{
		Map<T,U> map=new HashMap<T,U>();
		map.put(t, u);
		System.out.println(map);
	}
	
	
}

