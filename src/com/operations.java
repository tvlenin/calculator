/**
 * Created by tvlenin on 17/06/16.
 *
 */
package com;
import java.lang.*;
public class operations {
    //reduceEQ receive a equation and return the same reduced
    public String reduceEQ (String eq){
        String result = "";
        String [] eqAux = eq.split(",");
        int eqLength = eqAux.length;
        //iterate the elements of the eq
        for (int i = 0 ; i < eqLength-1; i++){
            for(int j = i+1; j < eqLength ; j++ ){ //iterate the elements of the rest of the list
                if(eqAux[i].charAt(eqAux[i].length()-2) == eqAux[j].charAt(eqAux[j].length()-2) && eqAux[i].charAt(eqAux[i].length()-1) == eqAux[j].charAt(eqAux[j].length()-1)){//Evaluate if x and y  are equal to plus
                    String eq1 = eqAux[i];
                    String eq2 = eqAux[j];
                    String newEQ="";
                    if (eq1 != "null"){
                        newEQ = getSum(eq1,eq2);
                    }
                    if (newEQ == ""){
                    eqAux[i] = "null";
                    eqAux[j] = "null";
                    }
                    else {
                        eqAux[i] = newEQ;
                        eqAux[j] = "null";
                    }

                }
            }
        }
        for ( int k = 0; k < eqLength; k++){
            if(eqAux[k] != "null"){
                result +=eqAux[k] + "|";
            }
        }
        if (result.endsWith("|")) {
            result = result.substring(0, result.length() - 1);
        }

        return result;
    }
    //Auxiliar to sum equal Equations
    private String getSum(String num1, String num2){

        String result = "";
        boolean flag = false;
        String variables = (num1.charAt(num1.length()-2))+""+(num1.charAt(num1.length()-1));
        char symbol1 = num1.charAt(0);
        char symbol2 = num2.charAt(0);
        int numb1 = Integer.parseInt(num1.substring(1, num1.length()-2));
        int numb2 = Integer.parseInt(num2.substring(1, num2.length()-2));

        if (symbol1 == '-' && symbol2 == '-'){
            result = (-numb1-numb2) + variables;
        }
        else if (symbol1 == '-' && symbol2 == '+'){
            if (numb1 == numb2 )
                flag = true;
            else if (numb2 > numb1)
                result = "+" + (-numb1+numb2) + variables;
            else
                result = (-numb1+numb2) + variables;
        }
        else if (symbol1 == '+' && symbol2 == '-'){
            if (numb1 == numb2 )
                flag = true;
            else if(numb1 > numb2)
                result ="+" + (numb1-numb2) + variables;
            else
                result = (numb1-numb2) + variables;
        }
        else{
            result = "+"+(numb1+numb2) + variables;
        }

        if(flag)
            result ="";





        return result;
    }
    public String sumPol(String num1, String num2){
        String newNum = num1+","+num2;
        return reduceEQ(newNum);
    }
    public String substPol(String num1, String num2){
        String result = "";
        String [] eqAux = num2.split(",");
        int eqLength = eqAux.length;
        for (int i =0 ; i < eqLength ; i++){
            if(eqAux[i].charAt(0) == '-'){
                eqAux[i] = eqAux[i].replace("-","+");
            }else{
                eqAux[i] = eqAux[i].replace("+","-");
            }

        }
        for ( int k = 0; k < eqLength; k++){
            if(k != eqLength-1 ){
                result +=eqAux[k] + ",";
            }else{
                result +=eqAux[k] ;
            }
        }

        return sumPol(num1,result);
    }
    public String multiPol(String num1, String num2){
        String result = "";
        String numAux1 = "";
        String numAux2 = "";
        String numAux3 = "";
        String [] eqAux1 = num1.split(",");
        String [] eqAux2= num2.split(",");
        int eqLength1 = eqAux1.length;
        int eqLength2 = eqAux2.length;

        for (int i = 0 ; i < eqLength1 ; i++){
            numAux1 = eqAux1[i];
            for (int j = 0; j < eqLength2; j++){
                numAux2 = eqAux2[j];
                if (numAux1.charAt(0) == numAux2.charAt(0)){numAux3 += "+";}
                else{numAux3 += "-";}
                numAux3+= Integer.parseInt(numAux1.substring(1,numAux1.length()-2)) * Integer.parseInt(numAux2.substring(1,numAux2.length()-2));
                numAux3 += Integer.parseInt(numAux1.charAt(numAux1.length()-2)+"") + Integer.parseInt(numAux2.charAt(numAux2.length()-2)+"") ;
                numAux3 += Integer.parseInt(numAux1.charAt(numAux1.length()-1)+"") + Integer.parseInt(numAux2.charAt(numAux2.length()-1)+"") ;
                result+=numAux3+"|";
                numAux3 = "";
            }
            //result+=numAux3+"|";
        }

        result=result.substring(0,result.length()-1);


        return result;
    }
    public int eval (String poly, int x ,int y){
        int result = 0;
        int numAux = 0;
        String [] eqAux = poly.split(",");
        int eqLength = eqAux.length;

        for(int i = 0; i < eqLength ; i++ ){
            numAux += Integer.parseInt(eqAux[i].substring(0,eqAux[i].length()-2)) * (int)Math.pow(x,Integer.parseInt(eqAux[i].charAt(eqAux[i].length()-2)+""))* (int)Math.pow(y,Integer.parseInt(eqAux[i].charAt(eqAux[i].length()-1)+""));

            result +=numAux;
            numAux = 0;
        }



        return result;
    }


}

