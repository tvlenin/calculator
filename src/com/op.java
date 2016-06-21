package com;
import java.lang.*;
/**
 * Created by tvlenin on 20/06/16.
 */
public class op {

    public String reduce(String pData){
        String ans="";
        String []  equ = pData.split(",");
        String [] data1;
        String [] data2;
        for(int i=0; i<equ.length; i++){
            for(int j =i+1; j<equ.length; j++){
                data1=(equ[i]).split(" ");
                data2=(equ[j]).split(" ");
                if(equ[j]=="null"||equ[i]=="null"){
                    continue;
                }
                else if( data1[2].compareTo(data2[2])==0 &&  (data1[3].compareTo(data2[3])==0)){
                //else if(data1[2]==data2[2] && data1[3]==data2[3]){
                    equ[j]="null";
                    equ[i]=(getSum(data1[0]+data1[1],data2[0]+data2[1])+ " " +data1[2]+" "+ data1[3]);
                    i=0;
                }
            }
        }
        for(int i=0;i<equ.length;i++){
            if(equ[i]=="null"){
                continue;
            }else{
                ans=ans+equ[i];
            }
        }
        return ans;
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

    public String insertspace(String pData){
        String ans;
        ans = pData;
        System.out.print(ans);
        return ans;
    }

    public boolean validate(String pData){
        pData= pData.replace('|',',');
        System.out.println(pData);
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

    public String delSpace(String txt){
        String [] print = txt.split(",");
        int len = print.length;
        String result = "";
        for (int i = 0; i < len; i++){
            if(i == 0){
                result += print[i].substring(0,print[i].length()-1)+",";
            }
            else if (i != len-1)
                result += print[i].substring(1,print[i].length()-1)+",";

            else
                result += print[i].substring(1,print[i].length());
        }

        return result;
    }

    public String sumPol(String num1, String num2){
        String newNum = num1+","+num2;
        return reduce(newNum);
    }

    public String substPol(String num1, String num2){
        String result = "";
        String [] eqAux = num2.split(",");
        int eqLength = eqAux.length;
        String [] numAux;
        for (int i =0 ; i < eqLength ; i++){
            numAux = eqAux[i].split(" ");
            if(numAux[0].compareTo("-") == 0){
                numAux[0] = "+";
            }else{
                numAux[0] = "-";
            }
            eqAux[i] = numAux[0]+" "+numAux[1]+" "+numAux[2]+" "+numAux[3];
        }
        for ( int k = 0; k < eqLength; k++){
            if(k != eqLength-1 ){
                result +=eqAux[k] + ",";
            }else{
                result +=eqAux[k] ;
            }
        }
        //return result;
       return sumPol(num1,result);
    }

    public String addSym(String num1){
        //Agrega el signo de positivo a las que no lo contienen
        String [] p = num1.split(",");
        String [] numAux;
        for (int i = 0 ; i < p.length;i++){
            numAux = p[i].split(" ");
            System.out.println(p[i]);
            if (numAux[0].compareTo("-") ==0 || numAux[0].compareTo("+") ==0){

            }
            else{p[i] = "+"+p[i] ;System.out.println(p[i]);}
        }
        String resul = "";
        for (int i = 0 ; i < p.length;i++){
            if (p[i] == "null"){

            }else{
                resul += p[i] + "|";
            }
        }
        return resul;

    }

}
