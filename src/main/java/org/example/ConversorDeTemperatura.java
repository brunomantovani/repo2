package org.example;

public class ConversorDeTemperatura {

    // Um método estático que recebe um valor em graus Celsius e retorna o equivalente em graus Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        // A fórmula para converter Celsius para Fahrenheit é: F = C * 1.8 + 32
        double fahrenheit = celsius * 1.8 + 32;
        return fahrenheit;
    }

    // Um método principal para testar o conversor de temperatura
    public static void main(String[] args) {
        // Um exemplo de valor em graus Celsius
        double celsius = 25;
        // Chamando o método celsiusParaFahrenheit e armazenando o resultado em uma variável
        double fahrenheit = celsiusParaFahrenheit(celsius);
        // Imprimindo o resultado na tela
        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");
    }
}
