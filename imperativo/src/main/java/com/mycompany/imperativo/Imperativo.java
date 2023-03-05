

package com.mycompany.imperativo;


public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosPares = new int[numeros.length];
        int contador = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares[contador] = numero;
                contador++;
            }
        }
        int[] resultado = new int[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = numerosPares[i];
        }
        System.out.println(Arrays.toString(resultado));
    }
}
