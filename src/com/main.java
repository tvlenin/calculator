package com;

import java.lang.*;
public class main{

    String eq1=  "123|245|145";
    String eq2 =  "143|225|144";
    public static void main(String[] args) {


        String eq2 =  "+ 100 2 5,+ 2 2 5,- 3 3 5,- 2 4 3,+ 3 4 3";
        String eq1 =  "+143|+122|+144";
        String eq3 =  "+122|-523";
        op ope = new op();

        //System.out.println(ope.reduceEQ(eq2));
       // System.out.println(ope.getSum("-1","+2"));

        String [] print = eq2.split(",");
        int len = print.length;
        String result = "";
        for (int i = 0; i < len; i++){
            if (i != len-1)
                result += print[i]+" | ";
            else
                result += print[i];
        }
        System.out.println(result);















        /*
        System.out.println(eq2);
        System.out.println(op.reduceEQ(eq2.replace("|",",")));
        System.out.println("EQ1 = " + eq1);
        System.out.println("EQ3 = " +eq3);
        System.out.println(op.substPol(eq1.replace("|",","),eq3.replace("|",",")));

        String numAux1 = "-15023";
        String numAux2 = "-15045";
        System.out.println( op.multiPol(eq1.replace("|",","),eq3.replace("|",",")));

        System.out.println(op.eval(eq3.replace("|",","),2,3));













        //Agrega el signo de positivo a las que no lo contienen
        String [] p = eq2.split(",");
        for (int i = 0 ; i < p.length;i++){
            if (p[i].charAt(0) == '-' || p[i].charAt(0) == '+'){
                System.out.println("Si");
            }
            else{p[i] = "+"+p[i] ;}
        }
        String result = "";
        for (int i = 0 ; i < p.length;i++){
            if (p[i] == "null"){

            }else{
                result += p[i] + "|";
            }
        }
        System.out.println(result.substring(0,result.length()-1));


        //Comprueba si un A0 es igual a 0 y lo elimina de la ecuacion
        /*for (int i = 0 ; i < p.length;i++){
            if (p[i].charAt(1) == '0'){
                p[i] = "null";
            }
            else{}
        }
        String result = "";
        for (int i = 0 ; i < p.length;i++){
            if (p[i] == "null"){

            }else{
                result += p[i] + "|";
            }
        }



        System.out.println(result.substring(0,result.length()-1));
        */


    }

}