package com;

import java.lang.*;
public class main{

    String eq1=  "123|245|145";
    String eq2 =  "143|225|144";
    public static void main(String[] args) {
        String eq2 =  "+143|+125|+144|+125|-544|+225";
        String eq1 =  "+143|+125|+144";
        String eq3 =  "+125|-544|+225";
        operations op = new operations();
        System.out.println(eq2);
        System.out.println(op.reduceEQ(eq2.replace("|",",")));
        System.out.println("EQ1 = " + eq1);
        System.out.println("EQ3 = " +eq3);
        System.out.println(op.substPol(eq1.replace("|",","),eq3.replace("|",",")));







    }

}