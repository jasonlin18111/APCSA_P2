//� A+ Computer Science  -  www.apluscompsci.com
//Name - Jason Lin
//Date - 2/8/18
//Class - Period 2
//Lab  - Lab05d

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = ' ';
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{	
		return theChar;
	}

	public boolean isUpper( )
	{
		return Character.isUpperCase(theChar);
	}

	public boolean isLower( )
	{
		return Character.isLowerCase(theChar);

	}
	
	public boolean isNumber( )
	{
		return Character.isDigit(theChar); 
	}	

	public int getASCII( )
	{
		int ASCII = (int) getChar();
		return ASCII;
	}

	public String toString()
	{
		if (isNumber() == true){
			return getChar() + " is a number. ASCII == " + getASCII() + "\n";
		}
		else if (isLower() == true){
			return getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		else if (isUpper() == true){
			return getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	  	  
		}
		else{
			return "";
		}
	}
}