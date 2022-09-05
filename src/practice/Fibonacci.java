package practice;

public class Fibonacci {
public static void main(String[] args) {
	int n=7;
	int first=0;
	int second=1;
	int fibo;
	System.out.print(first + " "+second);
	
	for(int i=3;i<n;i++) {
		fibo=first+second;
		System.out.print(" "+fibo);
		first=second;
		second=fibo;
	}

}
}
