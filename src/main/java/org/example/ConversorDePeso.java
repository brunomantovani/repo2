package org.example;

public class ConversorDePeso {

 // Um array estático com os nomes das unidades de peso
 public static String[] unidades = {"grama", "quilograma", "tonelada", "onça", "libra", "quilate"};

 // Um array estático com os fatores de conversão entre as unidades de peso
 public static double[] fatores = {1, 1000, 1000000, 28.3495, 453.592, 0.2};

 // Um método estático que recebe um valor em uma unidade de peso e retorna um array com os equivalentes em todas as outras unidades
 public static double[] converterPeso(double valor, String unidade) {
     // Um array para armazenar os resultados da conversão
     double[] resultados = new double[unidades.length];
     // Uma variável para armazenar o fator de conversão da unidade de entrada
     double fator = 0;
     // Um laço for para percorrer o array de unidades
     for (int i = 0; i < unidades.length; i++) {
         // Se a unidade de entrada for igual à unidade do array, armazenar o fator de conversão correspondente
         if (unidade.equalsIgnoreCase(unidades[i])) {
             fator = fatores[i];
         }
     }
     // Se o fator de conversão for diferente de zero, realizar as conversões
     if (fator != 0) {
         // Um laço for para percorrer o array de resultados
         for (int i = 0; i < resultados.length; i++) {
             // A fórmula para converter uma unidade de peso para outra é: R = V * F1 / F2
             // Onde R é o resultado, V é o valor de entrada, F1 é o fator de conversão da unidade de entrada, e F2 é o fator de conversão da unidade de saída
             resultados[i] = valor * fator / fatores[i];
         }
     }
     // Retornar o array de resultados
     return resultados;
 }

 // Um método principal para testar o conversor de peso
 public static void main(String[] args) {
     // Um exemplo de valor em uma unidade de peso
     double valor = 100;
     String unidade = "quilograma";
     // Chamando o método converterPeso e armazenando o resultado em um array
     double[] resultados = converterPeso(valor, unidade);
     // Imprimindo o resultado na tela
     System.out.println(valor + " " + unidade + " equivalem a:");
     // Um laço for para percorrer o array de resultados
     for (int i = 0; i < resultados.length; i++) {
         // Imprimindo cada resultado com a respectiva unidade
         System.out.println(resultados[i] + " " + unidades[i]);
     }
 }
}
