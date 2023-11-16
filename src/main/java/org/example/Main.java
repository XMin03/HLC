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
        double opcion=pedirNumero(pregunta);
        switch (opcion){
            case 1:
                double b=pedirNumero("Dime la base del triangulo");
                double h=pedirNumero("Dime la altura del triangulo");
                double l1=pedirNumero("Dime el lado1 del triangulo");
                double l2=pedirNumero("Dime el lado2 del triangulo");
                trianguloArea(b,h);
                trianguloPerimetro(b,l1,l2);
                break;
            case 2:
                double l=pedirNumero("Dime la base del cuadrado");
                cuadradoArea(l);
                cuadradoPerimetro(l);
                break;
            case 3:
                b=pedirNumero("Dime la base del rectangulo");
                h=pedirNumero("Dime la altura del rectangulo");
                rectanguloArea(b,h);
                rectanguloPerimetro(b,h);
                break;
            case 4:
                double r=pedirNumero("Dime el radio del circulo");
                circuloArea(r);
                circuloPerimetro(r);
                break;
            case 5:
                b=pedirNumero("Dime la base del pentagono");
                h=pedirNumero("Dime la apotema del pentagono");
                pentagonoArea(b,h);
                pentagonoPerimetro(b);
                break;
            case 6:
                b=pedirNumero("Dime la base del hexagono");
                h=pedirNumero("Dime la apotema del hexagono");
                hexagonoArea(b,h);
                hexagonoPerimetro(b);
                break;
            case 0:
                break;
            default:
                System.out.println("opcion incorrecta");
        }
        if (opcion!=0){
            menu();
        }
    }
    public static double pedirNumero(String mensaje){
        System.out.println(mensaje);
        double num=0;
        try {
            num= sc.nextDouble();
            sc.nextLine();
        }catch (Exception e){
            sc.nextLine();
            num=pedirNumero(mensaje);
        }
        return num;
    }
    /**fin codificación: Mattia Lu - 14/11/2023  */
    public static double trianguloArea(double base, double altura){
        double resultado = (base *altura) /2;
        System.out.println(resultado);
        return resultado;
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