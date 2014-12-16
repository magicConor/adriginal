public class DiceGame {
	
	//Created two methods that will generate random numbers between 1 and 6
	public static int randomDice1()
	{
	//I specified the range
	   double range = (6 - 1) + 1;     
	   return (int)(Math.random() * range) + 1; //Returned the generated value
	}

	public static int randomDice2()
	{
	   double range = (6 - 1) + 1;  	
	   return (int)(Math.random() * range) + 1;
	}

	//Created a boolean method that will check whether the result is 7
	public static boolean looseCheck(int result) {
			
		if (result != 7) {
			return true;
		}
		else {
			return false;
		}
	}

	//Created a boolean method that will check whether the player won
	public static boolean winCheck(int result) {
			
		if (result ==  2 ||result ==  3 || result ==  11 || result ==  12) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String [] args) {
		//Set  the variable answer to 'y', in orsder to initialise the loop		
		int result = 0;

		//Check whether the result is equal to seven
		while(looseCheck(result)) {
				
				//Prompt the user and read input, whether the user wants to play
				System.out.println("Would you like to play (y/n): ");
				char answer = Console.readChar();				

				if(answer == 'y'){
								
					//Call the two methods that generate a random dice result		
					int dice1 = randomDice1();
					int dice2 = randomDice2();
					//Add the two dice results together
					result = dice1 + dice2;	
					
					//Print the result to screen
					System.out.println("The dice are:");
					System.out.println("\t" + dice1 + "\t" + dice2);
					System.out.println("The total is " + result);
					
					//Check whether the user won
					if(winCheck(result)) {
						System.out.println("Congratulations, you won!");
						break;
					}

					if(!looseCheck(result)) {
						System.out.println("Unfortunately, you lost.");
					}	
				}

		}
		 
	}
}

/*
Testing:
1.First I created two methods that will generate random numbers between 1-6
2.After, I put the methods in a for loop and tested whether the numbers are random and the range between 1 and 6
3.I tested various combinations, like whether the 'y' of 'n' will work at warious stages of playing the game.
4.Finally, I ensured that the code will not continue to exectute id the user won or lost. 
*/
