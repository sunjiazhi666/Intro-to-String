import java.util.Scanner;

public class introtostring
	{

		public static void main(String[] args)
			{
				challenge1();
				challenge2();
				challenge3();
			}

		private static void challenge3()
			{
				System.out.println("vowels checker, write a sentence");
				Scanner userInput1 = new Scanner(System.in);
				String sentence = userInput1.nextLine();
				String vowels1 = "a";
				String vowels2 = "e";
				String vowels3 = "i";
				String vowels4 = "o";
				String vowels5 = "u";
				
				for()
				
			}

		private static void challenge2()
			{
				
				System.out.println("Write somethings in uppercase");
				Scanner userInput1 = new Scanner(System.in);
				String uppercase = userInput1.nextLine();
				
				
				
				String lowercase = uppercase.toLowerCase();
				int long1 = uppercase.length();
				System.out.println(uppercase.substring(0, 1));
				 
				for(int i = 1; i < long1; i ++ ){
					
					System.out.println( lowercase.substring(i ,i + 1));
				}
			}

		private static void challenge1()
			{
				System.out.println("Write somethings in uppercase");
				Scanner userInput2 = new Scanner(System.in);
				String uppercase = userInput2.nextLine();
				
				
				
				String lowercase = uppercase.toLowerCase();
				
				System.out.println(uppercase.substring(0, 1) + lowercase.substring(1));
				
			}
		
		
		
		
		
		
		
		
		
		

	}
