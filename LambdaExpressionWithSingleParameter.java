package com;

//with parameter with return type
interface cool {
String Say(String name);
}

public class LambdaExpressionWithSingleParameter {

 public static void main(String[] args) {
        cool c = (name) -> {

        	return "my name is .." + name;
        };
        System.out.println(c.Say("Yug"));
        }
}