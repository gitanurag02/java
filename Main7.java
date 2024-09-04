import java.util.*;

public class Main {

	private static void reverseArray(int[] arr) {
		int l = 0;
		int r = arr.length - 1;
		while (l < r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] numbers = new int[n];
		int[] evenNumbers = new int[n];
		int[] oddNumbers = new int[n];

		int evenCount = 0;
		int oddCount = 0;

		for (int i = 0; i < n; i++) {
			int num = scanner.nextInt();
			numbers[i] = num;
			if (num % 2 == 0) {
				evenNumbers[evenCount++] = num;
			} else {
				oddNumbers[oddCount++] = num;
			}
		}

		evenNumbers = Arrays.copyOf(evenNumbers, evenCount);
		oddNumbers = Arrays.copyOf(oddNumbers, oddCount);

		Arrays.sort(evenNumbers);
		reverseArray(evenNumbers);
		Arrays.sort(oddNumbers);

		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.print(evenNumbers[i] + " ");
		}

		for (int i = 0; i < oddNumbers.length; i++) {
			System.out.print(oddNumbers[i] + " ");
		}
	}

}