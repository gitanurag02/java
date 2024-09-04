public class Main {

	static String countLowercaseLetters(String s1) {
		String ans = "";
		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			if (Character.isLowerCase(s1.charAt(i))) {
				ans = ans + s1.charAt(i);
				count++;
			}
		}

		ans=ans+":"+count;
		return ans;
	}

	public static void main(String[] args) {
		String input = "AbcDe";
		System.out.println(countLowercaseLetters(input));
	}
}