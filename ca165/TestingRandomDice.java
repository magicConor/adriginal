public class TestingRandomDice {
	
	//Created two methods that will generate random numbers between 1 and 6
	public static int randomDice() {
	//I specified the range
	   final double RANGE = 6;     
	   int dice = (int)(Math.random() * RANGE) + 1;
	   return dice; //Returned the generated value
	}
	//Method that generates a single array of random numbers and returns an array
	public static int [] diceArray(int numOfTries) {
		int result [] = new int[numOfTries];
		for(int i = 0; i < numOfTries; i++){
			result[i] = randomDice();
		}
		return result;
	}
	//Method that returns a 2d array of 50 random single arrays
	public static int [][] roll50(int numOfTries){
		int [][] multidimensionalArray = new int[50][numOfTries];
		for(int i = 0; i < 50; i++) {
			multidimensionalArray[i]= diceArray(numOfTries);
		}  
		return multidimensionalArray;
	}
	//This array stores the 50 arrays generated in the previous array in the array it returns
	public static int [][] storeDice(int numOfTries) {
		int [][] arrayNumbers = new int[50][7];
		int [][] dice = roll50(numOfTries);
		for(int r = 0; r < 50; r++){
			for(int c = 0; c < numOfTries; c++) {
				int index = dice[r][c];
				arrayNumbers[r][index]++;
			}
		}
		return arrayNumbers;
	}
	//A short method dividing the imput by 50
	public static double divideBy50(double i) {
		double divide = i / 50;
		return divide;
	}
	//This method counts how many times each dice numbers repeat and divides by 50 to get the average of the 50 tries
	public static double [] average(int numOfTries) {
		int [][] dice = storeDice(numOfTries);
		double [] numbers = {0,0,0,0,0,0,0};
		for(int i = 0; i < 50; i++) {
			numbers[1] = dice[i][1] + numbers[1];
			numbers[2] = dice[i][2] + numbers[2];
			numbers[3] = dice[i][3] + numbers[3];
			numbers[4] = dice[i][4] + numbers[4];
			numbers[5] = dice[i][5] + numbers[5];
			numbers[6] = dice[i][6] + numbers[6];
		}
		for (int x = 0;x < 7; x++) {
			numbers[x] = divideBy50(numbers[x]);
		}
		return numbers;
	}

	//This method counts how many times each dice numbers repeats and assigns the most number of times a particular number occured
	public static int [] most(int numOfTries) {
		int [] numbers = {0,0,0,0,0,0,0};
		int [][] dice = storeDice(numOfTries);
		
		for(int i = 0; i < 50; i++) {
			if(dice[i][1] > numbers[1]) {
				numbers[1] = dice[i][1];
			}	
			if(dice[i][2] > numbers[2]) {
				numbers[2] = dice[i][2];
			}
			if(dice[i][3] > numbers[3]) {
				numbers[3] = dice[i][3];
			}
			if(dice[i][4] > numbers[4]) {
				numbers[4] = dice[i][4];
			}
			if(dice[i][5] > numbers[5]) {
				numbers[5] = dice[i][5];
			}
			if(dice[i][6] > numbers[6]) {
				numbers[6] = dice[i][6];
			}
		}
		return numbers;
	}

	//This method counts how many times each dice numbers repeats and assigns the least number of times a particular number occured
	public static int [] least(int numOfTries) {
		int [] numbers = {0,numOfTries,numOfTries,numOfTries,numOfTries,numOfTries,numOfTries};
		int [][] dice = storeDice(numOfTries);

		for(int i = 0; i < 50; i++) {
			if(dice[i][1] < numbers[1]) {
				numbers[1] = dice[i][1];
			}	
			if(dice[i][2] < numbers[2]) {
				numbers[2] = dice[i][2];
			}
			if(dice[i][3] < numbers[3]) {
				numbers[3] = dice[i][3];
			}
			if(dice[i][4] < numbers[4]) {
				numbers[4] = dice[i][4];
			}
			if(dice[i][5] < numbers[5]) {
				numbers[5] = dice[i][5];
			}
			if(dice[i][6] < numbers[6]) {
				numbers[6] = dice[i][6];
			}
		}

		return numbers;
	}
	
	public static void main(String[] args) {
		//If the user enters an invalid number a break statement will return them here
		main:
		//Prompt the user to type in the number of times the dice will be thrown
		System.out.println("How many throws of the dice: ");
		int numOfTries = Console.readInt();
		//Create an array that will store the results

		//Reassign all the methods to arrays, in order to be able to easily call the index value
		double [] arrayAvg = average(numOfTries);
		int [] arrayMost = most(numOfTries);
		int [] arrayLeast = least(numOfTries);

		//Print outt the table 
		System.out.println("Number" + " \t" + "Average" + " \t " + "Most" + "\t\t" + "Fewest");
		//Check whether the number is greater than 0, due to the NegativeArraySizeException
		if(numOfTries>=0){
			//Loop thorugh the 6 numbers possible in order to generate numbers created by the methods above
			for (int i = 1;i < 7;i++) {
				System.out.print(i + ": \t");
				System.out.print(arrayAvg[i]);
				System.out.print("\t\t" + arrayMost[i]);
				System.out.println("\t\t" + arrayLeast[i]);
			}
		}
	}
}

/*
Program Testing:
1.Firstly, I tested whether the for loop will print out the dice numbers ranging from 1 to 6
2.Secondly, I tried putting in different values for the number of throws, like 0, -1, 10000, in order to see whether the program will work and 
I realised that any number below 0 will give a NegativeArraySizeException, therefore I put in an if statement, that will sovle this problem
3.In order to assign values of the random dice array quickly I tried using the: java.util.Arrays.fill(result, randomDice());, however it hass assigned
same values to all elements of the array, therefore this hasn't been used further in testing the program
4.In order to test the content of each array, I have used "System.out.println(java.util.Arrays.toString(diceArray()));" to print out the content, as
if I just printed diceArrray(), I got memory locations of where the value was stored, eg. [I@20be8464 .
5.Part of testing, where I tried to create a separate method for checking:
	public static boolean diceCheck(int a) {
		if(diceArray() == a) {
			return true;
		}	
		return false;
	}	
6. I also tried to separate the method that will loop through the multidimensional array, but instead I have decided to integrate it into the storeDice()
public static int [][] storeDice(int numOfTries){
		int[ ][ ] arrayNumbers = new int[numOfTries][6];
		for(int i = 0; i < numOfTries; i++) {
			arrayNumbers[i]= storeDice(numOfTries);
		}
				return arrayNumbers;
	} 
7. Finally, I have tested the program with many different values and made sure it gave correct answers.
*/