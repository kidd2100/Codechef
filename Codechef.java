/* package codechef; // don't place package name! 
 * Takes input from user in following format:
 * Total Test Cases
 * Amount of customers
 * Amount of money in atm
 * Amount of money customer would like to with draw
 * During each test case the following code determines 
 * during each customers transaction if there is enough money available to 
 * allow the customer to with draw the money.
 * The problem is Supplied from Codechef and solution is based on their criteria.
 * */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner userInput = new Scanner(System.in);
		int t = userInput.nextInt();
		 
		while(t > 0) {
		int numOfPeople = 0;
		int atmMoney = 0;
		numOfPeople = userInput.nextInt();
		atmMoney = userInput.nextInt();
		int[] moneyRequested = new int[numOfPeople];
		
		//for loop that inserts money in to an array
		for(int i = 0; i < numOfPeople;i++){
		    moneyRequested[i] = userInput.nextInt();
		}
		
		//for loop that defines if atm has enough money to give to user
		for(int i = 0; i < numOfPeople; i++){
		    
			//if statements that prints 1 if enough money, 0 if not enough money
			if(atmMoney >= moneyRequested[i]){
		    	System.out.print("1");
		        atmMoney -= moneyRequested[i];
		         
		    }else if(atmMoney < moneyRequested[i]){
		        System.out.print("0");
		        
		    } else{
		    System.out.println("Error");
		
		    }
		    }
		t--;
		System.out.println("");
		}
		userInput.close();
	}
}
