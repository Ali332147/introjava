package firstLastWord;

public class FirstLastWord {
public static void main(String[] args) {
	String str="Java Python JS";
	int firstPosition=str.indexOf(" ");
	String firstWord=str.substring(0,firstPosition);
	String lastWord=str.substring(str.lastIndexOf(" ")+1);
	System.out.println("First Language is : "+firstWord);
	System.out.println("Last Language is : "+lastWord);
}
}
