package br.com.cferrer;


import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        Integer numWrapper = numero;

        System.out.println("Número digitado: " + numWrapper);

        sc.close();


    }
}
