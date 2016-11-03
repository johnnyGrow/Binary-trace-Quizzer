import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Runner
	{
		static int target;
		static ArrayList<Integer>myArray=new ArrayList<Integer>();
		static int counter=0;
		static int input;
		static int answer;
		static int indices=-1;

		static boolean stillTakingInput=true;
		public static void main(String[] args)
			{
				
				
			takeInput();

			}








			public static void takeInput()
			{
			 while(stillTakingInput)
				 {
						Scanner userInput=new Scanner(System.in);

					 System.out.println("what number would you like to input?");
					 input =userInput.nextInt();
					 if(input>20||input==0||input<-1)
						 {
							 System.out.println("You cannot use a number under 1 or above 20");
							 takeInput();
						 }
					 if(input==-1)
						{
							stillTakingInput=false;
							quizzer();
							break;
						}
					 if(input<1)
						 {
							 System.out.println("you cannot use a number below 1");
							 
							 
						 }
					 if(input>20)
						 {
							 System.out.println("you cannot use a number above 20!");
							 
						 }
					
						
					 counter=counter + 1;
					 myArray.add(input);
					Collections.sort(myArray);
							 	
				 
				 }
			}
			
			
			
			
			public static void quizzer()
			{
				for(Integer i: myArray)
					{
						
					 				System.out.printf(" "+i);
					 			
					}
				int target= (int)(Math.random()*counter)+1;
				 target= target-1; 
				 System.out.println(" your target is "+myArray.get(target));
				 passing();
			}
			
			
			
			
			
			public static void passing()
			{
				Scanner userInput=new Scanner(System.in);
				System.out.println("Passing Line 1#");

				 
				 int middle=5;
				 int right=3;
				 int left=0;
				 
				 System.out.println("Right:");
				 int answerRight =userInput.nextInt();

				 if(answerRight==right)
					 {
						 System.out.println("correct");
					 }
				 else
					 {
						 System.out.println("wrong, right is "+right);
					 }
				 
				 System.out.println("Middle:");
				 int answerMiddle =userInput.nextInt();
				 if(answerMiddle==middle)
					 {
						 System.out.println("correct");
					 }
				 else
					 {
						 System.out.println("wrong, correct answer is "+ middle);
					 }
				 
				 System.out.println("Left:");
				 int answerLeft =userInput.nextInt();
				 if(answerLeft==left)
					 {
						 System.out.println("correct");
					 }
				 else
					 {
						 System.out.println("wrong correct answer is "+left);
					 }
				 if(target<myArray(middle))
					 {
						 
					 }
				 
				 
				
			}
			
			
}









