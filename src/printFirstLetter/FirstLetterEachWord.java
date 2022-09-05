package printFirstLetter;

public class FirstLetterEachWord {
public static void main(String[] args) {
	String str="Learning selenium with Java";
	splitWords(str);
}

static void splitWords(String str) {
	String arrWords[]=str.split(" ");
	System.out.println("Printing only first letter in each wodr :");
	for(int i=0;i<arrWords.length;i++) {
		String s=arrWords[i].toUpperCase();
		char word=s.charAt(0);
		System.out.println(word);
	}
	
}
}
