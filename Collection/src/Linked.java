import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linked {
public static void main(String[] arg)
{
	Scanner s=new Scanner(System.in);
	LinkedList list=new LinkedList();
	System.out.println("Name:");
	String name=s.next();
	System.out.println("Age:");
	int age=s.nextInt();
	System.out.println("Branch");
	String branch=s.next();
	System.out.println("A/C");
	int accn=s.nextInt();
	System.out.println("Amount :");
	int amnt=s.nextInt();
	list.add(name);
	list.add(age);
	list.add(branch);
    list.add(accn);
    list.add(amnt);
    Iterator itr = list.iterator();
    while(itr.hasNext())
    {
    	System.out.println(itr.next());
    	
     
    }
}
}
