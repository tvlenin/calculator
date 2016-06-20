package com;
import java.lang.*;
/**
 * Created by tvlenin on 20/06/16.
 */
public class op {
    public String reduceEQ (String eq){
        String result = "";
        String []  equ = eq.split(",");
        String [] eqAux;
        String [] eqAux2;
        int eqLength = equ.length;

        for (int i = 0 ; i < eqLength-1; i++) {
            eqAux = equ[i].split(" ");
            for (int j = i+1 ; j < eqLength-2 ;j++){
                if (equ[j] != "null" && equ[i] != "null" ){
                    eqAux2 = equ[j].split(" ");
                    System.out.println(equ[i]);
                    System.out.println(equ[j]);
                    System.out.println(eqAux[2]);
                    System.out.println(eqAux2[2]);
                    System.out.println(eqAux[3]);
                    System.out.println(eqAux2[3]);
                    System.out.println(eqAux2[2]);
                    if (eqAux[2].compareTo(eqAux2[2]) == 0 && eqAux[3].compareTo(eqAux2[3]) == 0){
                        equ[i] = getSum(eqAux[0]+eqAux[1],eqAux2[0]+eqAux2[1])+" "+eqAux[2]+" "+eqAux[3];
                        eqAux = equ[j].split(" ");
                        equ[j] = "null";

                    }

                }
            }

        }
        for ( int k = 0; k < eqLength; k++){
            if(equ[k] != "null"){
                result +=equ[k] + "|";
            }
        }
        if (result.endsWith("|")) {
            result = result.substring(0, result.length() - 1);
        }



        return result;
    }
    public String getSum(String num1, String num2){

        String result = "";
        boolean flag = false;
        //String variables = (num1.charAt(num1.length()-2))+""+(num1.charAt(num1.length()-1));
        char symbol1 = num1.charAt(0);
        char symbol2 = num2.charAt(0);
        int numb1 = Math.abs(Integer.parseInt(num1));
        int numb2 = Math.abs(Integer.parseInt(num2));

        if (symbol1 == '-' && symbol2 == '-'){
            result = "- "+(numb1+numb2) +"";
        }
        else if (symbol1 == '-' && symbol2 == '+'){
            if (numb1 == numb2 )
                flag = true;
            else if (numb2 > numb1)
                result = "+ " + (numb2-numb1) ;
            else
                result = "- "+(numb1-numb2) +"";
        }
        else if (symbol1 == '+' && symbol2 == '-'){
            if (numb1 == numb2 )
                flag = true;
            else if(numb1 > numb2)
                result ="+ " + (numb1-numb2) ;
            else
                result = "- "+(-numb1+numb2)+"";
        }
        else{
            result = "+ "+(numb1+numb2) ;
        }

        if(flag)
            result ="null";





        return result;
    }






    public boolean validate(String pData){
        boolean ans = true;
        String [] a = pData.split(",");
        String [] term;
        for(int i=0; i<a.length;i++){
            term=(a[i]).split(" ");
            if( term.length != 4){
                ans=false;
                break;
            }
            else if (term[0].compareTo("+")!=0 && term[0].compareTo("-")!=0 ){
                ans=false;
                break;
            }
            else if( !(isNumeric(term[1])) || !(isNumeric(term[2])) || !(isNumeric(term[3]))  ){
                ans=false;
                break;
            }
        }
        return ans;
    }

    private static boolean isNumeric(String str){
        try {
            double d = Double.parseDouble(str);
        }catch(NumberFormatException nfe) {
            return false;
        }
        return true;
    }


}
