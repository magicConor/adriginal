public class Encryption {
	//Create a nethod that will return a character array
	public static char [] encrypt(String text) {
		char [] character = new char[text.length()]; //An array that will store the characters
		//The loop will go through all of the character indexes up to text.length()
		for (int i = 0;i < text.length();i++ ) {
			character[i] = text.charAt(i);
		}
		return character;
	}

	public static void main(String[] args) {
		System.out.println("Enter a message to encrypt:");
		String text = Console.readString();
		System.out.println("Enter an encryption key:");
		int key = Console.readInt();
		//The array character is set to encrypt(text), in order to be able to loop through it
		char [] character = encrypt(text);
		char encryptedChar;

		for (int i = 0;i < text.length();i++ ) {
			character[i] = text.charAt(i);
			char oldChar = character[i];
			if (Character.isUpperCase(oldChar)) {
				encryptedChar = (char) (oldChar + key*3);//It will multiply the key by 3 to improve security
			}
			else {
				encryptedChar = (char) (oldChar + key);//It will set the value back to what it was in the previous program if the keys are the same	
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
all numbers are being shifted. 
	public static char [] allChars() {
		char [] all = {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
		return all;
	}
2.Finally I have tested many different phrases in order to make sure that the program works.
*/