package anaPanaGramCheck;

import java.util.Arrays;
//Anagram : contains same characters but in different orders
public class IsAnagram {
public static void main(String[] args) {
String s1="java";
String s2="avaj";
System.out.println("Anagram True or Flse : "+anagramCheck(s1,s2));
}
static boolean anagramCheck(String s1,String s2) {
	char[] strToArray1=s1.toCharArray();
	char[] strToArray2=s2.toCharArray();
	Arrays.sort(strToArray1);
	Arrays.sort(strToArray2);
	return Arrays.equals(strToArray1, strToArray2);
}
}
