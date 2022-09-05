package stringCount;

public class StrCount {
	public static void main(String[] args) {
		String str = "I love Bangla";
		System.out.println(str.toLowerCase());
//	String stRev=str.reverse.toString();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total str num : " + count);

	}
}
