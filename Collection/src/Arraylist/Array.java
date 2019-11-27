package Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		ArrayList<String> list=new ArrayList<String>(); //create the list
		list.add("hai");
		list.add("hell0");
		list.add("Welcome"); //add value for list
		ArrayList nwlist=new ArrayList<String>();//create for new list
		nwlist.add("looo");
		nwlist.add("ooi"); //add new value
		list.addAll(nwlist);
		Iterator itr=list.iterator();//iterator all values
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
