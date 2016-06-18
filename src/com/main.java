package com;

import java.lang.*;
public class main{

    String eq1=  "123|245|145";
    String eq2 =  "143|225|144";
    public static void main(String[] args) {
        String eq2 =  "+143|+125|+144|+125|-544|+225";
        String eq1 =  "+143|+122|+144";
        String eq3 =  "+122|-523";
        operations op = new operations();
        System.out.println(eq2);
        System.out.println(op.reduceEQ(eq2.replace("|",",")));
        System.out.println("EQ1 = " + eq1);
        System.out.println("EQ3 = " +eq3);
        System.out.println(op.substPol(eq1.replace("|",","),eq3.replace("|",",")));

        String numAux1 = "-15023";
        String numAux2 = "-15045";
        System.out.println( op.multiPol(eq1.replace("|",","),eq3.replace("|",",")));

        System.out.println(op.eval(eq3.replace("|",","),2,3));







    }

}