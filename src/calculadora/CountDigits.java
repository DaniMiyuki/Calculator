package calculadora;

public class CountDigits {

	public static int countDigits(String input) {
		int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }

        return count;
	}

}
