public class Q2V2
{
   private static void swap(String [] num, int i, int j)
   {
      String tmp = num[i];
      num[i] = num[j];
      num[j] = tmp;
   }

   public static void sort(String [] num)
   {
      for(int i = 0; i < num.length - 1; i++)
      {
         // First find the index of the smallest element
         int minIndex = i;
         for(int j = i + 1; j < num.length; j++)
            if(num[j].compareTo(num[i]) < 0)
               minIndex = j;

         // Swap the smallest with the current position
         swap(num, i, minIndex);
      }
   }

   public static int search(String [] a, String x)
   {
      int low = 0;
      int hi = a.length - 1;
      int index = -1;
      while(low <= hi)
      {
         int mid = (low + hi) / 2;
         if(x.compareTo(a[mid]) < 0)
            hi = mid - 1; // to the right
         else if(x.compareTo(a[mid]) > 0)
            low = mid + 1; // to the left
         else
         {
            // Neither greater than nor less than ...
            // ... must be equal
            index = mid; // a[mid] is our guy, set index to mid
            break;
         }
      }

      return index;
   }

   public static void main(String [] args)
   {
     System.out.println("How many words?");
      int size = Console.readInt();

	String [] num = new String[size];

	System.out.print("Enter " + size + " words: ");
      	for(int i = 0; i < num.length; i++)
         	num[i] = Console.readString();

	System.out.println();
      	System.out.println("The sorted array:");
      	for(int i = 0; i < num.length; i++)
        	System.out.print(num[i] + " ");


      // Call the sort method ...
      sort(num);

      // the array is now sorted ... print it out
      System.out.println();
      System.out.println("The sorted array:");
      for(int i = 0; i < num.length; i++)
         System.out.print(num[i] + " ");

      System.out.println("");

      System.out.println("Search:");
      String x = Console.readString();
      System.out.println(x + " is at index ");
      System.out.println(search(num, x));
   }
}