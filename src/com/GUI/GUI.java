package com.GUI;

import javax.swing.*;
import java.awt.event.*;
import com.GUI.plotter;

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
    private JLabel dataLabel;
    private JButton plotButton;

    private String inputData;

    public GUI(){

        super("Polynomial Calculator");
        super.setContentPane(panelMain);
        super.setBounds(200,100,500,350);                         //The bounds start(X,Y) bounds(Y,X)
        super.setResizable(false);
        super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
        super.setVisible(true);

        inputData="";

        //listeners for each botton
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"0";
                dataLabel.setText(inputData);
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"1";
                dataLabel.setText(inputData);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"2";
                dataLabel.setText(inputData);
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"3";
                dataLabel.setText(inputData);
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"4";
                dataLabel.setText(inputData);
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"5";
                dataLabel.setText(inputData);
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"6";
                dataLabel.setText(inputData);
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"7";
                dataLabel.setText(inputData);
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"8";
                dataLabel.setText(inputData);
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"9";
                dataLabel.setText(inputData);
            }
        });
        espaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+" ";
                dataLabel.setText(inputData);
            }
        });
        barButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputData=inputData+"|";
                dataLabel.setText(inputData);

            }
        });
        //listeners for the keys
        a7Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a8Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a9Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a4Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a5Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a6Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a1Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a2Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a3Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        a0Button.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        espaceButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        barButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        eButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        mulButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        susButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        addButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        delButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        clearButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });
        equalButton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GUI.this.keyPressed(e.getKeyChar());
            }
        });

        plotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plotter sinObject = new plotter(inputData,10,10);
                double y;
                for ( double x = -10; x<=10; x+=0.01 ) {
                    //EVALUATE THE CORRECTO FUNCTION
                    y = Math.sin(x); //equation
                    sinObject.drawPoint(x,y);
                }
            }
        });
    }
    //every listener calls this method, which selects the propper action
    private void keyPressed(char key){
        if(key=='0'){
            inputData=inputData+"0";
            dataLabel.setText(inputData);
        }
        else if(key=='1'){
            inputData=inputData+"1";
            dataLabel.setText(inputData);
        }
        else if(key=='2'){
            inputData=inputData+"2";
            dataLabel.setText(inputData);
        }
        else if(key=='3'){
            inputData=inputData+"3";
            dataLabel.setText(inputData);
        }
        else if(key=='4'){
            inputData=inputData+"4";
            dataLabel.setText(inputData);
        }
        else if(key=='5'){
            inputData=inputData+"5";
            dataLabel.setText(inputData);
        }
        else if(key=='6'){
            inputData=inputData+"6";
            dataLabel.setText(inputData);
        }
        else if(key=='7'){
            inputData=inputData+"7";
            dataLabel.setText(inputData);
        }
        else if(key=='8'){
            inputData=inputData+"8";
            dataLabel.setText(inputData);
        }
        else if(key=='9'){
            inputData=inputData+"9";
            dataLabel.setText(inputData);
        }
        else if(key=='s'){
            inputData=inputData+" ";
            dataLabel.setText(inputData);
        }
        else if(key=='|'){
            inputData=inputData+"|";
            dataLabel.setText(inputData);
        }
        else if(key=='E' || key=='e'){
            evaluate();
        }
        else if(key=='D' || key=='d'){
            delete();
        }
        else if(key=='C' || key=='c' ){
            clear();
        }
        else if(key=='*'){
            multiplication();
        }
        else if(key=='+'){
            addition();
        }
        else if(key=='-'){
            substraction();
        }
        else if(key=='='){
            getResult();
        }

        else{System.out.println("Unknown: "+key);}
    }

    //Methods for each of the operations
    private void delete(){}
    private void clear(){
        inputData="";
        dataLabel.setText("0");
    }
    private void evaluate(){}
    private void addition(){}
    private void substraction(){}
    private void multiplication(){}
    private void getResult(){}


}
