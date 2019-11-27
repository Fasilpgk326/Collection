package Casestudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Email {
	 public static void main(String[] arg)
	 {
		 int i,n;
		 String name,email; 
		 int age;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size");
		  n=sc.nextInt();
         ArrayList al=new ArrayList();
         Employee[] emp=new Employee[n];
		 for( i=0;i<n;i++)
		 {
                
				System.out.println("Enter your name");
				 name=sc.next();
				System.out.println("Enter your age");
				age=sc.nextInt();
				
				System.out.println("Enter your Emali-ID");
				 email=sc.next();
				 emp[i]=new Employee();
				System.out.println("Do u want to update the email yes/no");
				String m=sc.next();
				
			 String c=m.toLowerCase();//for converting to lower case
				if(c.contentEquals("yes")) {
					System.out.println("Enter the update");
					String m1=sc.next();
					emp[i].setEmail(m1);
					emp[i].setAge(age);
					emp[i].setName(name);
				}
				else
				{
					
					emp[i].setAge(age);
					emp[i].setName(name);
					emp[i].setEmail(email);
				}
				al.add(emp[i]);
		 }
		 Iterator<Employee> itr=al.iterator();
		 int j=1;
		 while(itr.hasNext())
		 {
			 Employee e=itr.next();
			 System.out.println("Employee Details"+ j);
			 System.out.println("**************************");
			 System.out.println("Name :"+e.getName());
			 System.out.println("Age :"+e.getAge());
			 System.out.println("Email :"+e.getEmail());
			 System.out.println("");
			 j++;
		
		 }
		 System.out.println("List of employee");
		 int index=0;
		 Iterator<Employee> itr2=al.iterator();
		 while(itr2.hasNext());
		 {
			 Employee e=itr.next();
					 System.out.println("ID       Name");
					 System.out.println("Do u want delete the employee details yes/no");
					 String m=sc.next();
                     String c=m.toLowerCase();
                     if(c.contentEquals("yes"))
                     {
                    	 System.out.println("Enter the employee id");
                    	 int id=sc.nextInt();
                    	 al.remove(id);
                    	 Iterator<Employee> itr1=al.iterator();
                    	 int j1=1;
                    	 while(itr1.hasNext())
                    	 {
                    		 Employee e1=itr.next();
                    		 System.out.println("Employee Details");
                    		 System.out.println("Name :"+e1.getName());
                    		 System.out.println("Age :"+e1.getAge());
                    		 System.out.println("Email :"+e1.getEmail());
                    		 j1++;	
                    	 }
                    			 
                     }
                     else
                     {
                    	 System.out.println("HAVE A NICE DAY");
                     }
					 
			 
		 }
	 }

}

	
	