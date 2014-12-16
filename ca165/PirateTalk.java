public class PirateTalk {
	//The library that contains the words that need to be translated
	public static String [] library() {
		String [] library = {"hello", "ahoy",
						 "hi", "yo-ho-ho",
						 "pardon me", "avast",
						 "excuse me", "arrr",
						 "my", "me",
						 "friend", "me bucko",
						 "sir", "matey",
						 "madam", "proud beauty",
						 "miss", "comely wench",
						 "stranger", "scurvy dog",
						 "where", "whar",
						 "is", "be",
						 "the", "th'",
						 "you", "ye",
						 "tell", "be tellin'",
						 "know", "be knowin'",
						 "how far", "how many leagues",
						 "old", "barnacle-covered",
						 "attractive", "comely",
						 "happy", "grog-filled",
						 "nearby", "broadside",
						 "restroom", "head",
						 "restaurant", "galley",
						 "hotel", "fleabag inn",
						 "pub", "Skull & Scuppers",
						 "bank", "buried treasure",
						};
		return library;				
	}

	//This method will change the word
	public static String change(String englishWord) {

		String[] lib = library();
		//The library of characters possible at the end of a word
		char [] punctuationLib = {'.', '!', '?', ',', ':', ';'};

		String pirateWord = englishWord;

		Character character = ' ';

		//Loop though the punctuationLib array
		for (int x = 0;x < 6; x++) {
			//Check whether there is a punctuation ath the end of the word
			if(englishWord.charAt(englishWord.length()-1) == punctuationLib[x]) {
			character = englishWord.charAt(englishWord.length()-1);
			englishWord = englishWord.substring(0,englishWord.length()-1);
			break;
			}
		}
		//Check is the first character of the word is uppercase
        if(Character.isUpperCase(englishWord.charAt(0))) {
       		englishWord = Character.toLowerCase(englishWord.charAt(0)) + englishWord.substring(1);
     		//It loops through the whole array and when it finds a matching word
            for (int i = 0; i < lib.length-1; i += 2)
            {
            	//Check if the word is equal to one in the library
				if (englishWord.equals(lib[i])) { 
		
		   			//It will assign it to i+1 and break
	       			pirateWord = lib[i+1] + character;
	       			//Combine the uppercase first letter wit the rest of the word
	       			pirateWord = Character.toUpperCase(pirateWord.charAt(0)) + pirateWord.substring(1);

	       			return pirateWord;
	        	}
	        }
       	}

       	else {
       		for (int i = 0; i < lib.length-1; i += 2) {
       			//Check if the word is equal to one in the library
       			if (englishWord.equals(lib[i])) {
			        //It will assign it to i+1 and break

			        pirateWord = lib[i+1] + character;
			        	
			        return pirateWord;
		    	}
		    }
       	}
		return pirateWord;
	}

	//The random arr generator
	public static String arr() {
	   String arr = "Arrrr ";
	   String nothing = "";
	   final double RANGE = 10;     
	   double chance = (Math.random() * RANGE) + 1;
	   //Check if the random chance is greater than a number & returns arr
	   if (chance > 8) {
	   		return arr;
	   }
	   return nothing; //Alternatively returns nothing
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the sentance to translate: ");	
		System.out.println("(press x to exit)");
		String word = "placeholder";
      	
      	while(word != null && !word.equals("x")) {
	      	
	      	//word = Console.readToken();
	        word = Console.readToken();
	        //Translate the word
	        word = change(word);

	        System.out.print(word + " " + arr());
      	}
	}	
}

/*
Testing:
1. In order to test wheter the Character.isUpperCase(word.charAt(0) statement checks the first char, I have set it to !Character.isUpperCase(word.charAt(0),
	so then every first char in a string that is lowercase will be converted to uppercase
2. To test the random arrr generator, I have put it in a for loop to se how 'random' the outcome is and found it to be correct the first few tests.
3. I had a problem where the line word = Character.toUpperCase(word.charAt(0)) + word.substring(1); would convert only "Hello" to upper case, 
	ie. it only works for the first array element in library. The way I found out this problem is by testing many different combinations and also
	looping thorugh the whole library.
4. 	After creating the required features of the assignment, I have used text files provided and ran them in the program using the termiinal (pipe |);
*/