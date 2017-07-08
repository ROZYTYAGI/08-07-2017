package generic;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
static void printList(List<?> list)
{
for(Object element: list)
{
	System.out.println("["+element+"]");
	
}
}
public static void main(String a[])
{
	CustomerKey ab=new CustomerKey(1,"Rozy");
	System.out.println(ab);
	List<Integer> list=new ArrayList<>();
	list.add(18);
	list.add(100);
	printList(list);
	List<String> strList=new ArrayList<>();
	strList.add("abc");
	strList.add("hdf");
	printList(strList);
}
}

