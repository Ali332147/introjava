package reverseSentence;

public class RevSentence {
	public static void main(String[] args) {
		String reverse = " Bangla English Frence";
		String splitArr[] = reverse.split("");
		System.out.print("Reverse  Word : ");
		for (int i = splitArr.length - 1; i >= 0; i--) {
			System.out.print(splitArr[i].toUpperCase());

		}
		System.out.println();
		System.out.print("Not Reverse  Word : ");
		for (int i = 0; i < splitArr.length; i++) {
			System.out.print(splitArr[i].toLowerCase());
		}
	}
}
