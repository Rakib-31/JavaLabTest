package com.lab.first;
import java.util.*;
import java.lang.*;
public class ClassDef {
	
	static int sum = 0,sum1 = 0;
    static boolean bool = false,bool1 = false;

	 public static void main(String[] args)
	 {
		 LabTestFirst lb = new LabTestFirst();
		 
		 int n = lb.randomNum();
		 
		 sum += n;
		 
		 System.out.println("Welcome to Mitchell's blackjack program!");
		 System.out.print("You get a " + n + " and a ");
		 
		 n = lb.randomNum();
		 System.out.println(n);
		 sum += n;
		 
		 System.out.println("Your total is " + sum);
		 
		 n = lb.randomNum();
		 sum1 += n;
		 
		 System.out.println("The dealer has a " + n + " showing,and a hidden card.");
		 System.out.println("His total is hidden, too.");
		 
		 int t = 1;
		 
		 while(t>0){
			 
			 System.out.println("Would	you	like	to	hit	or   stay?");
			 Scanner scan = new Scanner(System .in);
			 String s;
			 s = scan.nextLine();
			 
			 if(s.equals("hit")){
					 System.out.print("You drew a ");
					 n = lb.randomNum();
					 sum+=n;
					 System.out.println(n);
					 System.out.println("Your total is " + sum);
					 if(sum > 21){
						 System.out.println("Dealer total is " + sum1);
						 System.out.println("Dealer win");
						 break;
					 }
					 
			 }
			 
			 else{
				 System.out.println("You stays" + "\n" + "Your total is " + sum + "\n" + "Dealer total is " + sum1);
				 System.out.println("Okay,dealer's turn.");
				 
				 if(!bool)
				 {
					 n = lb.randomNum();
					 sum1 += n;
					 System.out.println("His hidden card was a " + n);
					 System.out.println("His total was " + sum1);
					 if(sum1 > 16){
						 System.out.println("Your total is " + sum);
						 System.out.println("YOU WIN!");
						 bool1 = true;
						 break;
					 }
					 bool = true;
				 }
				 
				 String c = "";
				 int t1 = 1;
				 
				 if(sum1 < sum)
					 c = "hit";
				 
				 else c = "stay";
				 
				 while(t1 > 0){
					 if(c.equals("hit")){
						 n = lb.randomNum();
						 System.out.println("Dealer	chooses	to hit." + "\n" + "He draws a " + n);
						 sum1 += n;
						 
						 if(sum1 < sum)
							 c = "hit";
						 
						 else c = "stay";
						 System.out.println("His total is " + sum1);
						 
						 if(sum1 > 16){
							 System.out.println("Your total is " + sum);
							 System.out.println("YOU WIN!");
							 bool1 = true;
							 break;
						 }
					 }
					 
					 else{
						 System.out.println("Dealer stays." + "\n" + "Dealer total is " + sum1 + "\n" + "Your total is " + sum);
						 System.out.println("Your turn");
						 break;
					 }
				 }
			 }
			 if(bool1) break;
	 }
	 
  }
	    
}
