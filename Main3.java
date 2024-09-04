import java.util.*;

public class Main {
    
	static int ans=1;
	public static int fact(String s1) {
		int count=0;
		for(int i=0; i<s1.length(); i++) {
			if( s1.charAt(i) == 'a'||
			        s1.charAt(i) == 'e'||
			        s1.charAt(i) == 'i'||
			        s1.charAt(i) == 'o'||
			        s1.charAt(i) == 'u'||
			        s1.charAt(i) == 'A'||
			        s1.charAt(i) == 'E'||
			        s1.charAt(i) == 'I'||
			        s1.charAt(i) == 'O'||
			        s1.charAt(i) == 'U')
			{
				count++;
			}
		}

		if(count == 0) {
			return 0;
		}
		else {
			int len = s1.length()-count;
			for(int i = 1; i <= len; i++) {
				ans *= i;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String s1 = "abc";
		System.out.println(fact(s1));
	}
}
