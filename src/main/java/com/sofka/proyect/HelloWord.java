package com.sofka.proyect;

import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hello Word");
        /**
         * Scanner se compone de (Scanner nombreDapturador = new Scanner (System.in))
         *
         */
        Scanner captura = new Scanner(System.in);
        System.out.println("Ingresa un dato");
        String dato = captura.nextLine();
        System.out.println(dato);
    }
}
