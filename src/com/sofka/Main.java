package com.sofka;

import com.sofka.Punto1.Punto1;
import com.sofka.Punto2.Punto2;
import com.sofka.Punto3.Punto3;
import com.sofka.Punto4.Punto4;
import com.sofka.Punto5.Punto5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static boolean bandera = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
        do {
            limpiarPantalla();
            menu();
            opcion = capturarOpcion();
            limpiarPantalla();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
    }

    private static void menu() {
        System.out.println("Escoja un punto del taller #1 de Variables e Impresiones");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                presioneCualquierTeclaParaContinuar();
                return true;
                // break;
            case 2:
                Punto2 p2 = new Punto2();
                p2.Punto2();      
                presioneCualquierTeclaParaContinuar();
                return true;
            // break;
            case 3:
                Punto3 p3 = new Punto3();
                p3.Punto3();
                presioneCualquierTeclaParaContinuar();
                return true;
            case 4:
                Punto4 p4 = new Punto4();
                p4.Punto4();
                presioneCualquierTeclaParaContinuar();
                return true;
            case 5:
                Punto5 p5 = new Punto5();
                p5.Punto5();
                presioneCualquierTeclaParaContinuar();
                return true;
            case 0:
                return false;
                // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    private static void presioneCualquierTeclaParaContinuar() { 
        System.out.println("Presione cualquier tecla para continuar...");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {}  
    }
}
