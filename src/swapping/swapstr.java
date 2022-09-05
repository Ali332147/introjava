package swapping;

public class swapstr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hello";
		String b = "world";
		a = a + b;
		System.out.println("A + B is : " + a);

		b = a.substring(0, a.length() - b.length());
		System.out.println("B is : " + b);
		a = a.substring(b.length());
		System.out.println("A is : " + a);

	}

}
