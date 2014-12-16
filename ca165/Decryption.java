public class Decryption {
	//Create a nethod that will return a character array
	public static char [] decrypt(String text) {
		char [] character = new char[text.length()]; //An array that will store the characters
		//The loop will go through all of the character indexes up to text.length()
		for (int i = 0;i < text.length();i++ ) {
			character[i] = text.charAt(i);
		}
		return character;
	}

	public static void main(String[] args) {
		System.out.println("Enter a message to decrypt:");
		String text = Console.readString();
		System.out.println("Enter an encryption key from the previous program:");
		int key = Console.readInt();
		//The array character is set to decrypt(text), in order to be able to loop through it
		char [] character = decrypt(text);
		char encryptedChar;

		for (int i = 0;i < text.length();i++ ) {
			character[i] = text.charAt(i);
			char oldChar = character[i];
			//This if statement will check whether the character is uppercase and add another level of security
			if (Character.isUpperCase(oldChar)) {
				encryptedChar = (char) (oldChar - key*3);
			}
			else {
				encryptedChar = (char) (oldChar - key);//It will set the value back to what it was in the previous program if the keys are the same	
			}
			System.out.print(encryptedChar);
		}
		System.out.println("");
	}
}
/*
Testing:
1.In orfer to test whether the program will work for all letters 
I created a separate class and tested it in the program to see whether 
all numbers are being shifted back to their ofiginal form. 
	public static char [] allChars() {
		char [] all = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		return all;
	}
2. I have even set the key to negative values in order to test the program 
*/