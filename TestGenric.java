package generic;
import java.util.ArrayList;
import java.util.List;



public class TestGenric {
	public static void main(String a[])
	{
		ArrayList list=new ArrayList();
		list.add("genric");
		list.add(5);
		list.add(new Person("class", 5));
	
System.out.println(list);
}
}
