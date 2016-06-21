package com.GUI;

import javax.swing.*;
import java.awt.event.*;
import com.op;

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

    private String term;
    private String terms;
    private String lastOpe;
    op operations;

    public GUI(){

        super("Polynomial Calculator");
        super.setContentPane(panelMain);
        super.setBounds(200,100,475,300);                         //The bounds start(X,Y) bounds(X,Y)
        super.setResizable(false);
        super.setDefaultCloseOperation(super.EXIT_ON_CLOSE);
        super.setVisible(true);
        operations = new op();
        term ="";
        terms ="";
        lastOpe= "";

        //listeners for each botton
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('0');
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('1');
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('2');
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('3');
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('4');
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('5');
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('6');
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('7');
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('8');
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('9');
            }
        });
        espaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('s');
            }
        });
        barButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('|');

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('c');
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('+');
            }
        });
        susButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('-');
            }
        });
        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('*');
            }
        });
        eButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('e');
            }
        });
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('d');
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                keyPressed('=');
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
                GUI.this.keyPressed('s');
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



    }
    //every listener calls this method, which selects the propper action
    private void keyPressed(char key){
        if(term=="Syntax error"){term="";}
        if(key=='0'){
            term = term +"0";
            dataLabel.setText(term);
        }
        else if(key=='1'){
            term = term +"1";
            dataLabel.setText(term);
        }
        else if(key=='2'){
            term = term +"2";
            dataLabel.setText(term);
        }
        else if(key=='3'){
            term = term +"3";
            dataLabel.setText(term);
        }
        else if(key=='4'){
            term = term +"4";
            dataLabel.setText(term);
        }
        else if(key=='5'){
            term = term +"5";
            dataLabel.setText(term);
        }
        else if(key=='6'){
            term = term +"6";
            dataLabel.setText(term);
        }
        else if(key=='7'){
            term = term +"7";
            dataLabel.setText(term);
        }
        else if(key=='8'){
            term = term +"8";
            dataLabel.setText(term);
        }
        else if(key=='9'){
            term = term +"9";
            dataLabel.setText(term);
        }
        else if(key=='s'){
            term = term +" ";
            dataLabel.setText(term);
        }
        else if(key=='|'){
            term = term +"|";
            dataLabel.setText(term);
        }
        else if(key=='+'){
            addition();
        }
        else if(key=='-'){
            subtraction();
        }
        else if(key=='*'){
            multiplication();
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
        else if(key=='='){
            getResult();
        }
        else{System.out.println("Unknown: "+key);}
    }

    //Methods for each of the operations
    private void addition(){
        term=operations.delSpace(term.replace("|",","));
        term = operations.addSym(term);
        if ( operations.validate(term)){
            lastOpe="+";
            if(terms==""){
                terms=term;
                term="";
            }
            dataLabel.setText(term);
        }else{
            term = "Syntax error";
            dataLabel.setText(term);
        }
    }

    private void subtraction(){
        boolean flag= true;
        if(term=="" || term=="Syntax error"){
            term = term+"-" ;
            flag=false;
        }else{
            for(int i=0;i<term.length();i++) {
                if(i==term.length()-2 && term.charAt(i)=='|' || i==term.length()-1 && term.charAt(i)=='|'){
                    term = term +"-";
                    flag= false;
                }
            }
        }
        if(flag){
            term=operations.delSpace(term.replace("|",","));
            term = operations.addSym(term);
            if ( operations.validate(term)){
                lastOpe="-";
                if(terms==""){
                    terms=term;
                    term="";
                }
                dataLabel.setText(term);
            }else{
                term = "Syntax error";
                dataLabel.setText(term);
            }
        }
        dataLabel.setText(term);
    }

    private void multiplication(){
        term=operations.delSpace(term.replace("|",","));
        term = operations.addSym(term);
        if ( operations.validate(term)){
            lastOpe="*";
            if(terms==""){
                terms=term;
                term="";
            }
            dataLabel.setText(term);
        }else{
            term = "Syntax error";
            dataLabel.setText(term);
        }
    }

    private void delete(){
        term="";
        dataLabel.setText("0");
    }
    private void clear(){
        term ="";
        terms="";
        dataLabel.setText("0");
        lastOpe= "";
    }

    private void getResult(){
        if(lastOpe== ""){
            return;
        }
        if(lastOpe=="e"){
            int num1 = Integer.parseInt(term.split(" ")[0]);
            int num2 = Integer.parseInt(term.split(" ")[1]);
            if(term.length()>2 ) {
                term= (operations.eval(operations.addSym(terms), num1, num2) +"");
                dataLabel.setText(term);
                return;
            }
        }
        term=operations.delSpace(term.replace("|",","));
        term = operations.addSym(term);
        if ( operations.validate(term)){
            if(lastOpe=="+") {
                term = operations.sumPol(terms,term).replace("+ ","");
            }else if(lastOpe=="-"){
                term = operations.substPol(terms,term).replace("+ ","");
            }else if (lastOpe=="*"){
                term = operations.multiPol(terms,term).replace("+ ","");
            }

            if(term==""){
                dataLabel.setText("");
            }else{
                dataLabel.setText(term.replace("," , " | "));}
        }else{
            term = "Syntax error";
            dataLabel.setText(term);
        }
    }

    private void evaluate(){
        lastOpe="e";
        terms=term;
        term="";
        dataLabel.setText(term);
    }



}
