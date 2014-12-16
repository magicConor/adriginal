import java.util.Random;

public class ArrayLab{
	
	public static boolean search(int [] numbers, int value)
	{
		for (int i = 0; i < numbers.length; i++) {
			if (value == numbers[i]) {
	   			return true;
	   		}
		}
		return false;
	}

	public static int [] counter(int numOfValues, int numOfTries) {
		Random generator = new Random();
		int [] generated= new int[numOfTries];
		for (int i = 0;i < numOfTries; i++) {
			generated[i] = 1 + generator.nextInt(numOfTries);
		}

		int [] counter = new int [numOfValues];

		for (int r = 0;r<numOfValues;r++) {
			for (int c = 0;c<numOfTries;c++) {
				if (generated[c] == r) {
					counter[r]++;
				}
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		
		//Q1
		//final String [] MONTHS = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		
		//Q2: 0

		//Q3:
		/*String [] names = { "Jeffrey", "Brandon", "Mary", "Tony" };
		//Brandon
		names[0] = "Geoff";*/

		//Q4: days[days.length-1]

		//Q5:
		/*
		for (int i = 0;i < MONTHS.length; i++) {
			System.out.println(MONTHS[i]);
		}
		*/

		//Q6:
		/*
		int [] scores = {20, 15, 13, 7, 25, 10};

		boolean containsFive = search(scores, 5); // would be false
		boolean containsSeven = search(scores, 7); // would be true
		
		System.out.println(containsFive);
		System.out.println(containsSeven);
		*/

		//Q7:
		
		System.out.println("How many throws of the dice: ");
		int numOfTries = Console.readInt(); //How many nymbers are generated
		System.out.println("What is the number of values:");
		int numOfValues = Console.readInt();//RANGE Of numbers generated

		int [] arrayNumbers = counter(numOfValues, numOfTries);

		for (int i = 0;i < numOfValues;i++) {
			System.out.print(i + ": \t");
			System.out.println(arrayNumbers[i]);
		}       
	}
}
