// Connor Morgan
// Java OOP
// Anagram Project
// Oct 8th 2022


import java.util.Scanner;

public class MorganAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1,word2;
		while(true) {
			System.out.print("Enter word 1: ");
			word1=sc.next();
			if(isValid(word1))
					break;
			else
				System.out.println("Invalid input");
		}
		
		while(true) {
			System.out.print("Enter word 2: ");
			word2=sc.next();
			if(isValid(word2))
					break;
			else
				System.out.println("Invalid input");
		}
		
		if(isAnagram(word1,word2))
			System.out.println(word1+" and "+word2+ " are anagrams");
		else
			System.out.println(word1+" and "+word2+ " are not anagrams");

	}
	
	private static boolean isValid(String str) {
		for(int i =0; i<str.length();i++)
			if(!Character.isLetter((str.charAt(0))))
				return false;
		return true;
	}
	
	private static boolean isAnagram(String word1, String word2)
	{
		word1=word1.toLowerCase();
		word2 =word2.toLowerCase();
		
		StringBuffer buffer = new StringBuffer(word2);
		for(int i =0;i<word1.length();i++) {
			if(buffer.indexOf(word1.charAt(i)+" ")!=-1) {
				buffer.deleteCharAt(buffer.indexOf(word1.charAt(i)+""));
			}
			else 
				return false;
		}
		return (buffer.length()==0);
	}

}
