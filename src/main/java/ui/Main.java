package ui;

import java.util.ArrayList;


public class Main {
    /*
     * Escribe un algoritmo que tenga como entrada una lista de n enteros en orden no
     * decreciente y genere la lista de todos los valores que aparecen  más de una vez.
     * a) Entrada: L = [1, 2, 2, 3, 4, 4, 4, 5, 6, 6]
     * b) Salida: R = [2, 4, 6]
     */
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> r = new ArrayList<>();
        if (arr.length > 1) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1] && (i == 1 || arr[i] != arr[i - 2])) {
                    r.add(arr[i]);
                }
            }
        }
        return r;
    }

    /* Un palíndromo es una cadena que se lee igual de izquierda a derecha que al revés.
     *
     * Escribe un algoritmo para determinar si una cadena de n caracteres es un palíndromo.
     *
     * a) Entrada: cadena = ”reconocer”
     * b) Salida: verdadero
     * c) Entrada: cadena = ”hola”
     * d) Salida: falso
     */
    public static boolean isPalindrome(String word) {
        boolean result = true;
        for (int i = 0; i < word.length() / 2 && result; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                result = false;
            }
        }
        return result;
    }

    /*
     * Escribe un algoritmo que cuente los bits 1 que aparecen en una cadena de bits,
     * examinando cada bit para determinar si es un 1.
     * a) Entrada: cadenaBits = ”1011001”
     * b) Salida: 4
     * */
    public static int countOneBits(String bits) {
        int res = 0;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // DUPLICADOS
        int[] l = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};
        ArrayList<Integer> r = findDuplicates(l);
        System.out.println(r);
        // PALINDROMOS
        String cadena_1 = "reconocer";
        String cadena_2 = "hola";
        System.out.println(isPalindrome(cadena_1));
        System.out.println(isPalindrome(cadena_2));
        // CONTADOR BIT
        String cadenaBits = "1011001";
        System.out.println(countOneBits(cadenaBits));
    }
}
