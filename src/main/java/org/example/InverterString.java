package org.example;

public class InverterString {

 // Um método estático que recebe uma string e retorna a mesma string invertida
 public static String inverterString(String s) {
     // Uma variável para armazenar a string invertida
     String invertida = "";
     // Um laço for para percorrer a string de trás para frente
     for (int i = s.length() - 1; i >= 0; i--) {
         // Concatenando cada caractere da string original na string invertida
         invertida = invertida + s.charAt(i);
     }
     // Retornando a string invertida
     return invertida;
 }
}
