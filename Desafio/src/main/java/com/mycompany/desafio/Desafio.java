/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.desafio;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Desafio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior1 = Integer.MIN_VALUE;
        int maior2 = Integer.MIN_VALUE;
        int contador = 0;
        
        while (contador < 10){
            System.out.println(":" + "Digite o número" + (contador + 1));
            int numero = scanner.nextInt();
            
            if (numero > maior1){
                maior2 = maior1;
                maior1 = numero;    
            } else if (numero > maior2){
                maior2 = numero;
            }
            
            contador++;
        }
        
        System.out.println("Os dois maiores números são: " + maior1 + " e " + maior2);
        
    }
}
