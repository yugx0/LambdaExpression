package com;

import java.util.ArrayList;
import java.util.List;
//loop demo
public class LambdaExpressionWithLamdhaLoop {

  public static void main(String[] args) {
        List<String> listname = new ArrayList<String>();

        listname.add("Yug");
        listname.add("ram");
        listname.add("tom");
        listname.add("joyti");

        listname.forEach((n) -> System.out.println(n));
 }
}
