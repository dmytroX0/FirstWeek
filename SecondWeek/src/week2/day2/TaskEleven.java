package week2.day2;

import java.util.*;

public class TaskEleven {

	public static void main(String[] args) {
		 long n,fact=1;
			
		    Scanner sc = new Scanner(System.in);
	 
		    System.out.println("enter number");
		   
	            n = sc.nextLong();
	 
		    for(int i=1; i<=n; i++)
		    {
		
		    fact*=i;
	 
	 	    }
	 
	  	    System.out.println("factorial="+fact);
	}

}
