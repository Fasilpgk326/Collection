package Casestudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Scanner sc=new Scanner(System.in);
	  int option=0;
	  ArrayList list=new ArrayList();
	  do
	  { 
		  System.out.println("1.Display installed application\n2.Install an application\n3.Uninstall an application\n4.quit");
		   option=sc.nextInt();
		
		  
		 if(option==1)
		  {
			 if(list.isEmpty())
			 {
				 System.out.println("Not install any apps");
			 }
			 else
			 {
				 Iterator itr=list.iterator();
				 while(itr.hasNext())
				 {
					 System.out.println(itr.next());
				 }
			 }
          		  
		  }
		 else if(option==2)
		 {
			 System.out.println("Enter the app name");
			 String ap=sc.next();
			 list.add(ap);
		 }
		 else if(option==3)
		 {
			 if(list.isEmpty())
			 {
				 System.out.println("Not install any apps");
				 
			 }
			 else
			 {
			 
			 System.out.println("List of apps :");
			 Iterator itr =list.iterator();
			 int ind=0;
			 while(itr.hasNext())
			 {
				 System.out.println(itr.next()+ " "+ ind);
				 ind++;
			 }
			 
			 //deletion
			 System.out.println("Do u want to delete any apps");
			 String st1=sc.next();
			 String y1=st1.toLowerCase();
			 if(y1.contentEquals("yes"))
			 {
				 System.out.println("Enter the app id");
				 int eid =sc.nextInt();
				 list.remove(eid);
				 System.out.println("App uninstalled");
			 }
			 
			 else if(option==4)
			 {
				 System.exit(0);
			 }
			 else
			 {
				 System.out.println("invalid option");
			 }
		 }}
	  }while(option==1||option==2||option==3);
	  }}
