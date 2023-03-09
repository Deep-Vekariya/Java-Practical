// Error in Decryption

public class Cipher{
	public static void main(String[] args){
		Substitution_Cipher sc = new Substitution_Cipher();
		sc.Cipher("deep", 1);
		// sc.Encryption();
		String str=sc.Encryption();
		System.out.println(sc.Encryption());

		Substitution_Cipher sc1 = new Substitution_Cipher();
		sc1.Cipher(str, 1);
		System.out.println(sc1.Decryption());
	}
}

abstract class CipherDemo{
	String plainText;
	int key;

	void Cipher(String plainText, int key){
		this.plainText=plainText;
		this.key=key;
		System.out.println("constructor called..");
	}

	// declare two cipher methode 
	abstract String Encryption();
	abstract String Decryption();
}

class Substitution_Cipher extends CipherDemo{
	
	@Override

	String Encryption(){

		// convert string to char arry
		char[] pt = plainText.toCharArray();

		// creater char array of length of pt
		char[] ct = new char[pt.length];

			// encrept string 
			for(int i=0; i<pt.length; i++){

					// store asci value of char
					int asci = pt[i];

					// rem content coded value,which need to be rounded by 26 
					// (main logic of encryption)
					int rem = asci - (26 - (pt[i] -  'a'));


					// convert rem into char range,storing in value
					int value = rem % 26;

					// print char by adding asci value of 'a'
					// so it become in desire range of a-z

					ct[i] = (char)(value + 'a');
			}
			return String.valueOf(ct);
	}

	@Override
	String Decryption(){

		// convert string to char arry
		char[] pt = plainText.toCharArray();

		// creater char array of length of pt
		char[] ct = new char[pt.length];

			// encrept string 
			for(int i=0; i<pt.length; i++){

				int asci = pt[i];
				int rem = asci - (26 - (pt[i] -  'a'));
				int value = rem % 26;
				ct[i] = (char)(value + 'a');
			}
		return String.valueOf(ct);
	}
}
