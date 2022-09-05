package duplicateChar;

public class ShortFirstduplicate {

	public static void main(String[] args) {
		String str = "teeters";
		//char[]ch=str.toCharArray();
		for(int i=0; i<=str.length(); i++) {
			for(int j=i+1; j<=str.length();j++) {
				if(i==j) {
					System.out.println(i);				}
				}
			}
		}

	}


