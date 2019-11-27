package Set;

import java.util.HashSet;
import java.util.Iterator;

public class set {
	public static void main(String[] arg)
	{
		HashSet list=new HashSet();
		list.add("mayavi");
		list.add("radha");
		list.add("luttapi");
		list.add("raju");
		list.add("luttapi");
		
		
		
		Iterator itr =list.iterator();
		while(itr.hasNext())    //hashnext
		{
			System.out.println(itr.next());
		}
	}

}
