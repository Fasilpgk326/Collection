package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Clear {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		ArrayList list=new ArrayList();
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			String st=s.next();
		 list.add(st);
		}
		list.clear();
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
