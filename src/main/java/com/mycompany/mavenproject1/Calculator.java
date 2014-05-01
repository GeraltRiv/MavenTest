package com.mycompany.mavenproject1;
import java.util.*;


public class Calculator 
{
		
	public int funct(int a, int b, char sign)
	{
		int result = 0;
			switch (sign)
			{
			case '+':	result += a + b;
						break;
				
			case'-':	result += a - b;
						break;
				
			case'*':	result += a * b;
						break;
				
			case '/':	if(b == 0)
						{
							throw new ArithmeticException();
						}
						result += a / b;
						break;
					
			default:	throw new IllegalArgumentException();
			
			}
			return result;
	}
}
