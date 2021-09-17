package com;

interface Sayable{
	String say();
}

public class LambdaExpressionWithNoParameter {
	public static void main(String args[]) {
		 Sayable s = () -> {

			  return "hi, how are you";
	        };

	  System.out.println(s.say());
}
}
