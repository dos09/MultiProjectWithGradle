package tester;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

import generator.StringGenerator;

public class Tester {

	@Test
	public void test01() {
		Pattern regex = Pattern.compile("^[a-zA-Z]+$");
		Matcher matcher = regex.matcher("");
		for (int testNum = 0; testNum < 100; testNum++) {
			for (int strLen = 1; strLen <= 50; strLen++) {
				assertTrue(matcher.reset(StringGenerator.generateString(strLen)).matches());
			}
		}
	}

	@Test
	public void test02() {
		assertNull(StringGenerator.generateString(0));
		assertNull(StringGenerator.generateString(-1));
	}

}
