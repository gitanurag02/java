import java.util.*;
public class Main {

	public static String odd(int[] arr) {

		String ans = "";

		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] %2 == 0) {
				ans += "Even";
			}
			else {
				ans += "Odd";
			}
		}

		return ans;
	}


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		System.out.println(odd(arr));
	}
}