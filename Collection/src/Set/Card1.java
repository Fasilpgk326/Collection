package Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedList;



public class Card1 {
	public static void main(String[] arg)
	{
		String symbol;
		int num,count=0;
		Scanner sc=new Scanner(System.in);
		Set<NewCard> s=new TreeSet<NewCard>(new Symbol());
		NewCard[] c=new NewCard[40];
		int n=sc.nextInt();
		
		while(s.size()<n)//duplicate
		{
			symbol=sc.next();
			num=sc.nextInt();
			c[count]=new NewCard();
			c[count].setSymbol(symbol);
			
			c[count].setNumber(num);
			s.add(c[count]);
			count++;
		}
		System.out.println(n+"Symbols gathered in "+count+" cards.");
		System.out.println("Card are ");
		
		Iterator <NewCard> itr=s.iterator();
		while(itr.hasNext())
		{
			NewCard ca=(NewCard)itr.next();
			System.out.println(ca.getSymbol()+" "+ca.getNumber());
			}
	}

}

class NewCard {
	String symbol;
	int number;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}

class Symbol implements Comparator<NewCard>
{
	
	public int compare(NewCard c1, NewCard c2)
	{
		
		return c1.getSymbol().compareTo(c2.getSymbol());
	}

}