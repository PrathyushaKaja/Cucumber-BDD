package regularexpressions;

import java.util.regex.Pattern;

public class test1 {

	public static void main(String[] args) {
		boolean matchingStatus = Pattern.matches("^My.*a$", "My java");
		if (matchingStatus) {
			System.out.println("Matched");
		} else {
			System.out.println("Not matched");
		}

	}

}
