package org.example;

public class Calculadora {

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double divisao(double valor1, double valor2) {
        if(valor2 == 0) throw  new ArithmeticException();
        return valor1/valor2;
    }

}
