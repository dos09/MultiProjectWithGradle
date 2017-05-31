package entry;

import formatter.Formatter02;
import generator.StringGenerator;

public class Entry {
	public static void main(String[] args) {
		String str = StringGenerator.generateString(10);
		System.out.printf("Generated string: %s%n", str);
		System.out.printf("After swapCase: %s%n", Formatter02.swapCase(str));
	}
}
