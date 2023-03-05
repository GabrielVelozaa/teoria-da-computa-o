

package com.mycompany.funcional;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosPares = Arrays.stream(numeros)
                                    .filter(numero -> numero % 2 == 0)
                                    .toArray();
        System.out.println(Arrays.toString(numerosPares));
    }
}
