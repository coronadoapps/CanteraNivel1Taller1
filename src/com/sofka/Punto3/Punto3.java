package com.sofka.Punto3;

import java.util.Scanner;

public class Punto3 {

    private String nombreHijo;
    private String apellidosHijo;
    private String nombrePadre;
    private String apellidosPadre;
    private String nombreMadre;
    private String apellidosMadre;

    public void Punto3() {
        Enunciado();

        solicitarNombre("Hijo");
        nombreHijo = capturarDato();

        solicitarApellido("Hijo");
        apellidosHijo = capturarDato();

        solicitarNombre("Padre");
        nombrePadre = capturarDato();

        solicitarApellido("Padre");
        apellidosPadre = capturarDato();

        solicitarNombre("Madre");
        nombreMadre = capturarDato();

        solicitarApellido("Madre");
        apellidosMadre = capturarDato();

        mensaje(nombreHijo, apellidosHijo, nombrePadre, nombreMadre);

    }

    private void solicitarNombre(String persona) {
        System.out.println("Por favor digite el nombre del/de la ".concat(persona));
    }

    private void solicitarApellido(String persona) {
        System.out.println("Por favor digite los apellidos del/de la ".concat(persona));
    }

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private void Enunciado() {
        System.out.println("3. Realizar un programa el cual solicite su nombre y apellidos, también debe capturar nombre y apellidos de su padre y madre. Al finalizar debe imprimir en pantalla el siguiente mensaje Yo [Nombre Completo], soy hijo de [Nombre de la Madre] y [Nombre del Padre].");
    }

    private void mensaje(String nombreHijo, String apellidosHijo, String nombrePadre, String nombreMadre){
        System.out.println("Yo " + nombreHijo + " " + apellidosHijo + ", soy hijo de " + nombreMadre + " y " + nombrePadre + ".");
    }

}
