import java.util.Scanner;
public class methodPractice
	{

		public static void main(String[] args)
			
			{
				greetUser();
				generateLuckyNumber();
			}
		public static void greetUser ()
			{
			Scanner userInput= new Scanner (System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");
			}
		
			
		public static void generateLuckyNumber()
			{
			int luckyNumber=(int)(Math.random()*100)+1;
			
			System.out.println("Your lucky number is " + luckyNumber + "."); 
			
			
				
			if (luckyNumber < 10)
			
			{
				System.out.println("That's a low number");
				
			}
			
			else if (luckyNumber > 10)
			
				{
					System.out.println("Thats a cool number");
				}
	}
}
