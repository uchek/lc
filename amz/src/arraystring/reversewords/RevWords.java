package arraystring.reversewords;

import java.util.Arrays;

/*
 * Reverse Words in a String II
Given an input string , reverse the string word by word. 

Example:

Input:  ["t","h","e"," ","s","k","y"," ","i","s"," ","b","l","u","e"]
Output: ["b","l","u","e"," ","i","s"," ","s","k","y"," ","t","h","e"]
Note: 

A word is defined as a sequence of non-space characters.
The input string does not contain leading or trailing spaces.
The words are always separated by a single space.
Follow up: Could you do it in-place without allocating extra space?
 */

public class RevWords {
	/*
	 * 1st method. this is still ok.
	 * but not great solution
	 */
	public void rWords(char [] s) {
		String ts = new String(s);
		String [] as = ts.split(" ");
		
		int start=0, end=as.length-1;
		
		while(start < end) {
			String t = as[start];
			as[start] = as[end];
			as[end] = t;
			start ++;
			end --;
		}
		
		// Convert to char []
		// not that great solution
	}
	
	// 2nd method
	public void rWords1(char [] s) {
		//1. reverse the sentence
		
		
		rev(s, 0, s.length - 1);
		
		//2. reverse each word
		int start=0;
		for (int i=0; i<s.length; i++) {
			if (s[i] == ' ') {
				rev(s, start, i-1);
				start = i + 1;
			}
		}
		
		// 3, reverse the last word, if there is only one word this will solve the corner case
		rev(s, start, s.length - 1);
	}
	
	
	void rev(char []s, int start, int end) {
		while(start < end) {
			char t = s[start];
			s[start] = s[end];
			s[end] = t;
			start ++;
			end --;
		}
	}
	
	private void printArr(String []s) {
		System.out.printf("Len : %d\n", s.length);
		for (String ss:s){
			System.out.println(ss);
		}	
	}
}
