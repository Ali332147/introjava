package anaPanaGramCheck;

public class PanagramCheck {
//	Panagram : Contains all the alphabets from a to z
	public static void main(String[] args) {
	String s="The quick brown fox jumps OVER The lazy dog";
	System.out.println(s);
	System.out.println("Checking Panagram T or F : "+isPanagram(s.toLowerCase()));
	}

 static boolean isPanagram(String s) {
if(s.length()<26) {
	return false;
}	else {
	for(char ch='a';ch<='z';ch++) {
		if(s.indexOf(ch)<0) {
			return false;
		}
	}
}
return true;
	
}
	

}
