public class Main {

	static int difference(String s1,  String s2) {

		int ans = 0;

		String[] string1= s1.split(" ");

		int space1 = string1.length - 1;

		String[] string2= s2.split(" ");

		int space2 = string2.length - 1;

		if(space1>space2) {
			return space1-space2;
		} else
			return space2-space1;

	}

	public static void main(String[] args) {

		String s1 = "My name is Soura";
		String s2 = "Hello World";

		System.out.println(difference(s1,s2));

	}

}
