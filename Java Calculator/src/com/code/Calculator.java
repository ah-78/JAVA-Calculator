package com.code;

import javax.swing.*;
//.Functionalities are implemented.
//.Checks are implemented.

public class Calculator {
    private JButton PlusMinus;
    private JButton Clear2;
    private JButton Backspace;
    private JButton One;
    private JButton Seven;
    private JButton Four;
    private JButton Zero;
    private JButton Two;
    private JButton Five;
    private JButton Eight;
    private JButton Clear1;
    private JButton Nine;
    private JButton Six;
    private JButton Three;
    private JButton Point;
    private JButton Equal;
    private JButton Divide;
    private JButton Multiply;
    private JButton Subtract;
    private JButton Add;
    private JButton Percentage;
    private JButton Squareroot;
    private JButton Square;
    private JButton Dividebyx;
    private JTextArea Output;
    private JPanel Calpanel;
    private String o;
    private String o1;
    private String o2;


    public void setO(String s) {
        this.o = s;
    }

    public void setO1(String s) {
        this.o1 = s;
    }

    public void setO2(String s) {
        this.o2 = s;
    }

    public Calculator() {
        setO("");
        setO1("");
        setO2("");

        One.addActionListener(e -> {

            if(o.equals("")){
                o1= o1 + "1";
                Output.setText(o1);
            }
            else{
                o2= o2 + "1";
                Output.setText(o1+o+o2);
            }
        });
        Two.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "2";
                Output.setText(o1);
            }
            else{
                o2= o2 + "2";
                Output.setText(o1+o+o2);
            }
        });
        Three.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "3";
                Output.setText(o1);
            }
            else{
                o2= o2 + "3";
                Output.setText(o1+o+o2);
            }
        });
        Zero.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "0";
                Output.setText(o1);
            }
            else{
                o2= o2 + "0";
                Output.setText(o1+o+o2);
            }
        });
        Four.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "4";
                Output.setText(o1);
            }
            else{
                o2= o2 + "4";
                Output.setText(o1+o+o2);
            }
        });
        Five.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "5";
                Output.setText(o1);
            }
            else{
                o2= o2 + "5";
                Output.setText(o1+o+o2);
            }
        });
        Six.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "6";
                Output.setText(o1);
            }
            else{
                o2= o2 + "6";
                Output.setText(o1+o+o2);
            }
        });
        Seven.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "7";
                Output.setText(o1);
            }
            else{
                o2= o2 + "7";
                Output.setText(o1+o+o2);
            }
        });
        Eight.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "8";
                Output.setText(o1);
            }
            else{
                o2= o2 + "8";
                Output.setText(o1+o+o2);
            }

        });
        Nine.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + "9";
                Output.setText(o1);
            }
            else{
                o2= o2 + "9";
                Output.setText(o1+o+o2);
            }

        });
        Clear1.addActionListener(e -> {
            Output.setText(" ");
            setO("");
            setO1("");
            setO2("");
        });
        Clear2.addActionListener(e -> {
            Output.setText(" ");
            o1="";
            o="";
            o2="";
            setO("");
            setO1("");
            setO2("");
        });
        Point.addActionListener(e -> {
            if(o.equals("")){
                o1= o1 + ".";
                Output.setText(o1);
            }
            else{
                o2= o2 + ".";
                Output.setText(o1+o+o2);
            }
        });
        PlusMinus.addActionListener(e -> {
            if(o.equals("")){
                o1=  "-" + o1 ;
                Output.setText(o1);
            }
            else{
                o2= o2 + "-";
                Output.setText(o1+o+o2);
            }

        });
        Add.addActionListener(e -> {
            if(o.isEmpty()){
                o = "+";
                Output.setText(o1+o);
            }


        });
        Subtract.addActionListener(e -> {
            if(o.isEmpty()){
                o = "-";
                Output.setText(o1+o);
            }
        });
        Multiply.addActionListener(e -> {
            if(o.isEmpty()){
                o = "*";
                Output.setText(o1+o);
            }
        });
        Divide.addActionListener(e -> {
            if(o.isEmpty()){
                o = "/";
                Output.setText(o1+o);
            }
        });

        Equal.addActionListener(e -> {
            //System.out.println(o1);
            //System.out.println(o2);
            if(!o1.isEmpty()) {

                if (o.equals("")) {
                    Output.setText(o1);
                } else {
                    double num1;
                    double num2;
                    num1 = Double.parseDouble(o1);
                    num2 = Double.parseDouble(o2);
                    double num3;
                    //System.out.println(o);
                    switch (o) {
                        case "+":
                            num3 = num1 + num2;
                            setO1(String.valueOf(num3));
                            setO2("");
                            setO("");
                            //System.out.println(num3);
                            Output.setText(String.valueOf(num3));
                            break;
                        case "-":
                            num3 = num1 - num2;
                            setO1(String.valueOf(num3));
                            setO2("");
                            setO("");
                            //System.out.println(num3);
                            Output.setText(String.valueOf(num3));
                            break;
                        case "*":
                            num3 = num1 * num2;
                            setO1(String.valueOf(num3));
                            setO2("");
                            setO("");
                            //System.out.println(num3);
                            Output.setText(String.valueOf(num3));
                            break;
                    }
                    if (o.equals("/")) {
                        num3 = num1 / num2;
                        setO1(String.valueOf(num3));
                        setO2("");
                        setO("");
                        //System.out.println(num3);
                        Output.setText(String.valueOf(num3));
                    }
                }
            }
        });

        Percentage.addActionListener(e -> {
            double num1;
            if(o.equals("")){
                if(!o1.isEmpty()) {
                    Output.setText(o1 + "%");
                    num1 = Double.parseDouble(o1);
                    num1 = num1 / 100;
                    setO1(String.valueOf(num1));
                }

            }
            else{
                if(!o2.isEmpty()) {
                    Output.setText(o1 + o + o2 + "%");
                    num1 = Double.parseDouble(o2);
                    num1 = num1 / 100;
                    setO2(String.valueOf(num1));
                }
            }
        });
        Squareroot.addActionListener(e -> {
            if(!o1.isEmpty()) {
                double num1;
                num1 = Double.parseDouble(o1);
                num1 = Math.sqrt(num1);
                setO1(String.valueOf(num1));
                Output.setText(o1);
            }
        });
        Square.addActionListener(e -> {
            if(!o1.isEmpty()) {
                double num1;
                num1 = Double.parseDouble(o1);
                num1 = num1 * num1;
                setO1(String.valueOf(num1));
                Output.setText(o1);
            }
        });
        Dividebyx.addActionListener(e -> {
            if(!o1.isEmpty()){
                double num1;
                num1 = Double.parseDouble(o1);
                num1 = 1/num1;
                setO1(String.valueOf(num1));
                Output.setText(o1);
            }


        });
        Backspace.addActionListener(e -> {
            if(!o1.isEmpty()){
                String b = Output.getText();
                char c = b.charAt(b.length() - 1) ;
                String d = Character.toString(c);

                if(o.equals(d)){
                    System.out.println(o1);
                    setO("");
                    Output.setText(o1+o+o2);
                }
                else if(o.isEmpty()){
                    o1 = o1.substring(0,o1.length() - 1);
                    Output.setText(o1);
                }
                else{
                    o2 = o2.substring(0,o2.length() - 1);
                    Output.setText(o1+o+o2);
                }
            }



        });
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");
        f.setContentPane(new Calculator().Calpanel);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);

    }
}
