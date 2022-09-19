package com.ticket.demo;

import java.util.Arrays;
import java.util.Scanner;

class Ticket {
	public int TimeTaken(int tickets[],int e) {
		int seconds = 0;
		
		while (tickets[e]!=0)
		{
			for(int i=0; i<tickets.length; i++ )
			{
				if(tickets[i]==0)
					continue;
				
				if(tickets[e]==0)
					return seconds;
				
				tickets[i] = tickets[i] -1;
				seconds ++;
				
			}
		}
		return seconds;
		
	}
	
}

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the length of the Array ");
		
		  
    	int	j=sc.nextInt();
		   
	    int[] tickets1 = new int[j] ;
	   
	    System.out.println("Enter the Array Values");
			
		   for(int i=0; i<tickets1.length;i++)
		   {
			   tickets1[i]=sc.nextInt();
		   }
		
		System.out.println("Array  "+Arrays.toString(tickets1));
		System.out.println("");
		
        System.out.println("Enter the index value to find the seconds  ");
		
		int k1 = sc.nextInt();
		
		System.out.println("Total Seconds Taken To Buy the Tickets =  " + new Ticket().TimeTaken(tickets1, k1));
		
		sc.close();
	}

}


