package com.mycompany.property_management.controller;

public class CalculatorMain {
    public static void main(String []arg)
    {
        CalculatorController cc = new CalculatorController();
        Double Result = cc.add(5.0,9.0);
        System.out.println(Result);
    }
}
