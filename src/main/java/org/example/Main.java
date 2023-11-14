package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner sc=new Scanner(System.in);
    /** Inicio codificación: Mattia Lu - 14/11/2023  */
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        String pregunta="Calcular el area y perimetro de: ";
        pregunta+="\n\t1. Triangulo";
        pregunta+="\n\t2. Cuadrado";
        pregunta+="\n\t3. Rectangulo";
        pregunta+="\n\t4. Circulo";
        pregunta+="\n\t5. Pentagono";
        pregunta+="\n\t6. Hexagono";
        pregunta+="\t0. Exit";
        int opcion=pedirNumero(pregunta);
    }
    public static int pedirNumero(String mensaje){
        System.out.println(mensaje);
        int num=0;
        try {
            num= sc.nextInt();
            sc.nextLine();
        }catch (Exception e){
            sc.nextLine();
            num=pedirNumero(mensaje);
        }
        return num;
    }
    /**fin codificación: Mattia Lu - 14/11/2023  */
    public static void trianguloArea(){

    }
    public static void trianguloPerimetro(){

    }
    public static void cuadradoArea(){

    }
    public static void cuadradoPerimetro(){

    }
    public static void rectanguloArea(){

    }
    public static void rectanguloPerimetro(){

    }
    public static void circuloArea(){

    }
    public static void circuloPerimetro(){

    }
    public static void pentagonoArea(){

    }
    public static void pentagonoPerimetro(){

    }
    public static void hexagonoArea(){

    }
    public static void hexagonoPerimetro(){

    }


}