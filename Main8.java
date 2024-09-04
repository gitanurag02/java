import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.nextLine();

		int vSum = 0;
		int cSum = 0;

		for (char c : str.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vSum += c;
				} else {
					cSum += c;
				}
			}
		}

		int diff = Math.abs(vSum - cSum);
		System.out.println("Sum of ASCII values of vowels: " + vSum);
		System.out.println("Sum of ASCII values of consonants: " + cSum);
		System.out.println("Difference between them: " + diff);
	}
}
