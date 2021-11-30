package com.company.utils;

import java.util.stream.Stream;

public class UtilService {

    public Double getSumByExpression(String expression) {
        String[] caracteres = expression.split(" ");
        Double variavelA = 0.0;
        Double variavelB = 0.0;
        String funcao = "";
        for (int i = 0; i < caracteres.length; i++) {
            if (!isDigit(caracteres[i])) {
                funcao = caracteres[i];
                variavelA = Double.valueOf(caracteres[i-1]);
                variavelB = Double.valueOf(caracteres[i+1]);
            }
        }
        switch (funcao){
            case "+":
                return variavelA + variavelB;
            case "-":
                return variavelA + variavelB;
            case "/":
                return variavelA / variavelB;
            case "*":
                return variavelA * variavelB;
            default: return 0.0;
        }
    }

    private boolean isDigit(String c) {
        try {
            int teste = Integer.valueOf(c);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
