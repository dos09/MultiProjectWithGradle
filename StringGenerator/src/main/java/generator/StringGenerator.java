package generator;

import java.util.Random;

public class StringGenerator {
	
	public static String generateString(int stringLength) {
		String result = null;
		
		if(stringLength > 0) {
			Random rand = new Random();
			int asciiCode;
			StringBuilder sb = new StringBuilder();
			
			for(int i = 0; i < stringLength; i++) {
				asciiCode = rand.nextInt(26) + 65;
				if(rand.nextInt(2) == 0) {
					asciiCode += 32; //to lowercase
				}
				sb.append((char)asciiCode);
			}
			result = sb.toString();
		}
		
		return result;
	}
	
//	public static void main(String[] args) {
//	}
}