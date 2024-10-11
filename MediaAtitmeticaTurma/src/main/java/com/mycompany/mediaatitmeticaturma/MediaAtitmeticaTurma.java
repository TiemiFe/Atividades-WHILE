/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mediaatitmeticaturma;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MediaAtitmeticaTurma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos têm na sala?");
        int numAlunos = scanner.nextInt();
        double soma = 0;
        int contador = 0;
        
        while (contador < numAlunos){
            System.out.println("Entre com a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
            contador++;
        }
        
        double media = soma / numAlunos;
        System.out.println("A média aritmética da turma è: " + media);
    }
}
