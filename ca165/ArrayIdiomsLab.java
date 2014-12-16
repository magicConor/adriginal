public class ArrayIdiomsLab {
	
	static int sum(int[] a){
		int sum = 0;
		for (int i = 0;i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	static boolean check(int [] values){
		for (int i = 0;i < values.length/2; i++) {
			if (values[i] != values[(values.length - i) - 1]) {
				return false;
			}
		}
		return true;
	}

	static boolean uniqueElements(int[] a){
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++ ) {
				if (a[i] == a[j]) {
				return false;
				}	
			}
		}

		return true;
	}

	public static void main(String[] args) {
		//Q1:
		/*
		int [] nums1 = {1, 10, 20};
      	int sum1 = sum(nums1);

      	System.out.println("The total of all the elements of nums1 is " + sum1);

      	int [] nums2 = {1, 0, 0, 2, 3, 4};
      	int sum2 = sum(nums2);

      	System.out.println("The total of all the elements of nums2 is " + sum2);
		*/
		//Q2:
      	/*
		System.out.println("How many numbers?");
		int numOfValues = Console.readInt();
		int [] values = new int[numOfValues];
		System.out.println("Enter " + numOfValues + " numbers:");
		
		for (int i = 0;i < values.length; i++) {
			values[i] = Console.readInt();
		}
	
		if (check(values)) {
			System.out.println("Those numbers are the same when reversed.");
		}

		else {
			System.out.println("Those numbers are not the same when reversed.");
		}
		*/

		//Q4:

		System.out.println("How many numbers?");
		int numOfValues = Console.readInt();
		int [] values = new int[numOfValues];
		System.out.println("Enter " + numOfValues + " numbers:");
		
		for (int i = 0;i < values.length; i++) {
			values[i] = Console.readInt();
		}
	
		if (uniqueElements(values)) {
			System.out.println("No numbers repeat.");
		}

		else {
			System.out.println("One or more numbers repeat.");
		}
	}
}