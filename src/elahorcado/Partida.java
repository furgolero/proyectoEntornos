/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elahorcado;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class Partida {

    
    Pantalla pant = new Pantalla();
    Palabras palab = new Palabras();
    ArrayList<Jugador> jugadores = new ArrayList<>();
    char letraJuego;
    

    

    void muestraPalabra(int indice) {
        for (int i = 0; i < jugadores.get(indice).getPalabraSecreta().length; i++) {
            System.out.print(jugadores.get(indice).getPalabraSecreta()[i]);
            System.out.print(" ");
        }

    }//fin MuestraPalabra 

    public boolean comprobacion() {
        boolean encuentra = false;
        letraJuego = pant.pideLetra("Dime una letra");
        for (int i = 0; i < palab.palabraAleatoria.length(); i++) {
            if (letraJuego == palab.palabraAleatoria.charAt(i)) {
                encuentra = true;
                jugadores.get(i).getPalabraSecreta()[i] = palab.palabraAleatoria.charAt(i);

            }
                //jugador.numFallosJugad.set(i, jugador.numFallosJugad.get(i)+1);
            

        }
        if (encuentra) {
            System.out.println("si k esta");
        } else {
            System.out.println("no esta");
            
        }
        return encuentra;

    }//fin comprobacion
}//fin Partida

