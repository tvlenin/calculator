package com;

import javax.swing.*;
import java.util.*;
import com.GUI.*;

public class Main {

    public static void main(String[] args) {

        //This code open the main window
        //JFrame f = new JFrame("Polynomial Calculator");     //This is the main Frame
        //GUI userInterface = new GUI();                      //
        //f.setContentPane(userInterface.panelMain);          //
        //f.setBounds(200,100,500,350);                         //The bounds start(X,Y) bounds(Y,X)
        //f.setResizable(false);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //Close default method
        //f.pack();                                           //sizes the frame so that all its contents are at or above their preferred sizes
        //f.setVisible(true);                                 //

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
