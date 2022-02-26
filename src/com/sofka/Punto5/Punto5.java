package com.sofka.Punto5;

import java.util.Scanner;

public class Punto5 {

    private String nombreMascota;
    private String tipoMascota;
    private int edadMascota;
    private String dueno;

    public void Punto5() {
        Enunciado();

        solicitarDato("Mascota");
        nombreMascota = capturarDato();
        solicitarDato("Tipo de mascota");
        tipoMascota = capturarDato();
        System.out.println("Por favor digite la edad de la Mascota");
        edadMascota = capturarDatoInt();
        solicitarDato("Dueño(a) de la mascota");
        dueno = capturarDato();

        mensaje(nombreMascota, tipoMascota, edadMascota, dueno);

    }

    private void solicitarDato(String dato) {
        System.out.println("Por favor digite el nombre del(a) ".concat(dato));
    }

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private int capturarDatoInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    private void Enunciado() {
        System.out.println("5. Realizar un programa el cual solicite el nombre de su mascota, edad de la mascota, el tipo de mascota y su nombre completo. Al finalizar el sistema debe e imprimir en pantalla el siguiente mensaje: [Nombre de Mascota] es un(a) [Tipo de Mascota], el cual, tiene [Edad de la Mascota] años de edad y [Nombre Completo] es actualmente su dueño(a).");
    }

    private void mensaje(String nombreMascota, String tipoMascota, int edadMascota, String dueno){
        System.out.println(nombreMascota + " es un(a) " + tipoMascota + ", el cual, tiene " + edadMascota + " años de edad y " + dueno + " es actualmente su dueño(a).");
    }

}
