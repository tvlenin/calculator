package com;

import javax.swing.*;
import java.util.*;
import com.GUI.*;

public class Main {

    public static void main(String[] args) {

        GUI userInterface = new GUI();


        //While flag to capture the instructions of the user
        boolean flag = true;
        while (flag){
            System.out.println("Ingres the operation");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            System.out.println(s);
            if(s.contains("exit")){flag=false;System.out.println("Command promt finished");}
        }

    }
}
