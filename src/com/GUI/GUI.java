package com.GUI;

import javax.swing.*;
import java.awt.event.ComponentAdapter;

/**
 * Created by abrahamon on 18/06/16.
 */
public class GUI extends  JFrame{

    public JPanel panelMain;
    private JPanel panelInput;
    private JPanel panelButtons;
    private JButton a7Button;
    private JButton delButton;
    private JButton a8Button;
    private JButton a9Button;
    private JButton eButton;
    private JButton a4Button;
    private JButton a5Button;
    private JButton a6Button;
    private JButton mulButton;
    private JButton clearButton;
    private JButton a1Button;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton susButton;
    private JButton equalButton;
    private JButton espaceButton;
    private JButton barButton;
    private JButton addButton;

    private String inputData;

    public GUI(){
        super("Polynomial Calculator");
        super.setContentPane(panelMain);
        super.setBounds(200,100,500,350);                         //The bounds start(X,Y) bounds(Y,X)
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);

        inputData="";



    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
