/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elahorcado;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Pantalla {
    Scanner scn = new Scanner(System.in);
    String nombre;
    int numJugadores = 0;
    char letra;
    public void pideNombre(String texto){
        System.out.println(texto);
    nombre = scn.next();
    }
    public void pideJugadores(String texto){
        System.out.println(texto);
    numJugadores = scn.nextInt();
    }
    public char pideLetra(String texto){
        System.out.println(texto);
        letra=scn.next().charAt(0);
        return letra;
    }
}
