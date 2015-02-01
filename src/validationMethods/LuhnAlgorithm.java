package validationMethods;

import interfaces.ICheck;

public class LuhnAlgorithm implements ICheck {
	
	
	public boolean isValid(String number) {
		int checksum = 0;
		System.out.println(number.charAt(0));
		for(int i=0;i<(number.length());i++){
			int multiplicator = (i%2!=1) ? 2:1;
			System.out.println("Multiplicator" + multiplicator);
			int digit = Character.getNumericValue(number.charAt(i));
			System.out.println("Digit: "+ digit);
			if(digit*multiplicator<10){
				System.out.println(digit + "Checkdigit of this digit: " + digit*multiplicator);
				checksum += (digit*multiplicator);	
				System.out.println("New Checksum" + checksum);
				}
			else{
				char[] checkdigits = String.valueOf(digit*multiplicator).toCharArray();
				int sumCheckdigits = Character.getNumericValue(checkdigits[0]) + Character.getNumericValue(checkdigits[1]);
				checksum += sumCheckdigits;
				System.out.println(digit + ", Checkdigit for multidigit " + digit*multiplicator + ": " + sumCheckdigits);
				System.out.println("New Checksum" + checksum);
			}
		}
		return (checksum%10==0);
	}

}
