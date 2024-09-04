import java.util.*;

public class Main {

	public static int checkLength(String s1, String s2) {

		int length=0;

		int minLength = Math.min(s1.length(), s2.length());

		for(int i = 0 ; i < minLength; i++) {
			if(s1.charAt(s1.length()-i-1) == s2.charAt(s2.length()-i-1) ) {
				length++;
			} else {
				break;
			}
		}


		return length;
	}

	public static String checking(String s,String[] strArray) {

		Map<Integer,String> map = new HashMap<>();
		int max=0;

		for(int i = 0 ; i < strArray.length ; i++) {
			if(strArray[i].contentEquals(s)) {
				continue;
			} else {
				int length = checkLength(s,strArray[i]);

				if(max<length) {
					max=length;
				}

				map.put(length, strArray[i]);
			}

		}

		if(max!=0) {
			return map.get(max);
		} else {
			return "No Word";
		}
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string to check: ");
		String s = sc.nextLine();

		System.out.println("Enter the length of the string array: ");
		int n = sc.nextInt();
		String strArray[] = new String[n];
		System.out.println("Enter the array:");
		for(int i =0 ; i < n ; i ++) {
			String s1 = sc.nextLine();
			strArray[i] = s1;
		}

		System.out.println(checking(s,strArray));

	}
}