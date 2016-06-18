package com;

import javax.swing.*;
import java.util.*;
import com.GUI.*;

public class Main {

    public static void main(String[] args) {

        //This code open the main window
        JFrame f = new JFrame("Diabolic Magic Square");
        GUI userInterface = new GUI();
//        f.setContentPane(userInterface.panel1);
        f.setBounds(10,20,320,485);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        System.out.println("Inicio");

        //While to capture the instructions of the user
        while (true){
            System.out.println("--");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            System.out.println(s);

        }

    }
}
