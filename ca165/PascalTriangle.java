public class PascalTriangle {
	     
	    public static void main(String[] args) {
	         
	        System.out.println("How many lines of the Pascals triangle would you like to print out?");
      		int numOfRows = Console.readInt();
	         
	        for(int i = 0;i < numOfRows; i++) {
	            int number = 1;
	            System.out.printf("%"+(numOfRows-i)*2+"s","");
	            for(int j=0; j <= i; j++) {
	                 System.out.printf("%4d",number);
	                 number = number * (i - j) / (j + 1);   
	            }
	            System.out.println();
	        }	         
	    }
	}