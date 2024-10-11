/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imprimirnumeros1aten;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ImprimirNumeros1ateN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro N:");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++){
            System.out.println(i);
        }
    }
}
