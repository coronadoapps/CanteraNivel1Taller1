package com.sofka.Punto4;

import java.util.Scanner;

public class Punto4 {

    private String capital;
    private String pais;

    public void Punto4() {
        Enunciado();
        solicitarDato("Ciudad capital");
        capital = capturarDato();
        solicitarDato("Pais");
        pais = capturarDato();

        mensaje(capital, pais);

    }

    private void solicitarDato(String dato) {
        System.out.println("Por favor digite el nombre del(a) ".concat(dato));
    }

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private void Enunciado() {
        System.out.println("4. Realizar un programa el cual solicite el nombre de una ciudad capital y el país. Al finalizar debe imprimir en pantalla el siguiente mensaje La ciudad [Nombre de la Ciudad], es la capital del país [Nombre del País]");
    }

    private void mensaje(String capital, String pais){
        System.out.println("La ciudad " + capital + ", es la capital del pais " + pais);
    }

}
