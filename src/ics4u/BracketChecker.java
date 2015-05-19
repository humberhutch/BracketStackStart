package ics4u;

import java.util.Scanner;
import java.util.Stack;

/**
 * This program will use a Stack data structure from the Java Collections class 
 * to validate the proper nesting of brackets (parenthesis) in a string. 
 * Usually this would be used to check the validity of a math expression.
 * 
 * The program will notify the user if they have the proper number of opening
 * and closing brackets and then determine if they are nested properly or not.
 *  
 * @author Hutchison
 * @version 1.0
 */

public class BracketChecker {
	public static void main(String[] args) {
		
		String exp = getMathExpression();
		
		if (validNumBrackets(exp)){
			System.out.println("You have the correct number of opening and closing brackets.");
			if (validNestedBrackets(exp)){
				System.out.println("The brackets are nested properly.");
			}
			else {
				System.out.println("The brackets are not nested properly.");
			}
		}
		else {
			System.out.println("You do not have the correct number of brackets.");
		}

	}
	
	private static String getMathExpression(){
		Scanner in = new Scanner(System.in);
		String e = "";
		System.out.println("Type a mathematical expression with brackets. ");
		e = in.nextLine();
		in.close();
		return e;		
	}
	
	
	private static boolean validNumBrackets(String s){
		char[] c = s.toCharArray();
		// TODO
		
		return true;
	}

	private static boolean validNestedBrackets(String e){
		Stack<Character> nodes = new Stack<Character>();
		
		char[] c = e.toCharArray(); // convert the expression to a character array
		boolean isMatch = true;
		
		// Use a stack to validate the nesting of brackets
		// Push left brackets onto stack
		// When right bracket is encountered check the top of stack for a left bracket, if found remove otherwise error
		// If no error was encountered and stack is empty then return true
		int i=0;
		
		// TODO
		
		return isMatch;	
	}
}