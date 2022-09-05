package duplicateChar;

public class OnlyDuplicateChar {
public static void main(String[] args) {
	String s="I love Nature new kew";
	System.out.println("Character is : "+s);
	int len=s.length();
	char [] ch=s.toCharArray();
	System.out.print("Duplicate char is : ");
	for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++) {
			if(ch[i]==ch[j]) {
				
				System.out.print(ch[j]);
				break;
			}
		}
	}
	
}
}
