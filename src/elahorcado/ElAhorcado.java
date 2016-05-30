/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elahorcado;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class ElAhorcado {

    public static void main(String[] args) {

        Pantalla pant = new Pantalla();
        Palabras palab = new Palabras();
        Partida part = new Partida();
        Scanner scn = new Scanner(System.in);

        int cogeFallos;
        ArrayList<Jugador> jugadores = new ArrayList<>();

        String nombre;

        boolean resultadoComprobacion;
        //pido el numero de jugadores
        while (pant.numJugadores < 1 || pant.numJugadores > 10) {
            pant.pideJugadores("Dime el numero de jugadores (entre 1 y 10 incluidos)");
        }
        
        //pido el nombre de los jugadores
        for (int i = 1; i <= pant.numJugadores; i++) {
            pant.pideNombre("Dime el nombre del jugador: " + i);
            jugadores.add(new Jugador(pant.nombre));
        }
        
        for (int i = 1; i <= pant.numJugadores; i++) {
        jugadores.get(i).rellenaArray();
        }
        
        for (int i = 0; i < jugadores.size(); i++) {
            
            System.out.println("nombre: " + jugadores.get(i).getNombre() + " fallos: " + jugadores.get(i).getFallos());
        }
        
        
        while (jugadores.get(0).getFallos() < 5) {
            for (int i = 0; i < jugadores.size(); i++) {
                System.out.println("");
                System.out.println("Turno del jugador: " + (i + 1));
                System.out.println("");
                part.muestraPalabra(i);
                System.out.println("");
                System.out.println("");
                resultadoComprobacion = part.comprobacion();
                if (!resultadoComprobacion) {
                    cogeFallos = jugadores.get(i).getFallos();
                    jugadores.get(i).setFallos(cogeFallos + 1);
                    System.out.println("Fallos: " + jugadores.get(i).getFallos());
                } else {
                    System.out.println("Fallos: " + jugadores.get(i).getFallos());
                }
            }
        }

    }
}
