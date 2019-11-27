package Casestudy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Bookiing {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		int op;
		HashSet sc=new HashSet();
		do
		{
			System.out.println("1.Booking\n2.Check status\3.Exit");
			 System.out.println("Enter your choice");
			 
			op=s.nextInt();
			if(op==1)
			{
			System.out.println("Welcome");
			System.out.println("Enter number of customers");
			int n=s.nextInt();
			Details1[] c=new Details1[n];
			for(int i=0;i<n;i++)
			{
				c[i]=new Details1();
				System.out.println("Please choose the service requierd");
				System.out.println("AC/non-AC(AC/nAc");
				c[i].setAc(s.next());
				System.out.println("Double/single");
				c[i].setCot(s.next());
				System.out.println("wifi/not");
				c[i].setWifi(s.next());
				System.out.println("Cable/not");
				c[i].setCable(s.next());
				
				sc.add(c[i]);
			}
			Iterator<Details1> itr3=sc.iterator();
			int i=0;
		    while(itr3.hasNext())
		    {
		    	Details1 e=(Details1)itr3.next();
		    	int total,b=0,c1,e1,f,ii=1,d=0;
		    	if(e.getAc().contentEquals("AC")==true)
		    	{
		    		b=1500;
		    		
		    	}
		    	else
		    	{
		    		b=700;
		    	}
		    	if(e.getCot().contentEquals("single")==true)
		    	{
		    		c1=50;
		    		
		    	}
		    	else
		    	{
		    		c1=100;
		    	}
				if(e.getCable().equals("cable")==true)
				{
					d=50;
				}
				else
				{
					d=0;
				}
				if(e.getWifi().contentEquals("wifi")==true)
		    	{
		    		e1=150;
		    		
		    	}
		    	else
		    	{
		    		e1=0;
		    	}
				if(e.getLa().contentEquals("La")==true)
		    	{
		    		f=300;
		    		
		    	}
		    	else
		    	{
		    		f=0;
		    	}
				total=b+c1+d+e1+f;
				System.out.println("the toatal charge is Rs."+total);
                System.out.println("AC"+" "+e.getAc()+"\n"+"Room type"+e.getCot()+"\n"+"Wifi connection"+" "+e.getWifi()+"\n"+"Cable connection"+" "+e.getCable()+"\n"+"Laundry"+" "+e.getLa()+"\n"+"Room Number"+e.getId()+" ");
i++;
		    }
			}
			else if(op==2)
			{
				System.out.println("Enter the room number");
				int rom=s.nextInt();
				Iterator<Details1> itr4=sc.iterator();
				int i=0;
				while(itr4.hasNext())
				{
					Details1 ee=(Details1)itr4.next();
					int fgd=ee.getId();
					if(rom<=fgd)
					{
						System.out.println("room is not available");
						break;
					}
					else
					{
						System.out.println("room available");
						break;
					}
				}
			}
			else if(op==3)
			{
				System.exit(0);
			}
		    
		}while(op==1||op==2 || op==3);
		
				
			
	}}
				
class Details1
{
	String ac;
	String cot;
	String cable;
	String wifi;
	String la;
	int id;
	public String getAc() {
		return ac;
	}
	public void setAc(String ac) {
		this.ac = ac;
	}
	public String getCot() {
		return cot;
	}
	public void setCot(String cot) {
		this.cot = cot;
	}
	public String getCable() {
		return cable;
	}
	public void setCable(String cable) {
		this.cable = cable;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	public String getLa() {
		return la;
	}
	public void setLa(String la) {
		this.la = la;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}