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
public class Jugador {
    Partida part= new Partida();
    char[] palabraSecreta;
    String nombre;
    int fallos;
    

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.fallos = 0;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public char[] getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(char[] palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }
    
    void rellenaArray() {
        for (int i = 0; i < palabraSecreta.length; i++) {
        
            palabraSecreta[i] = '-';
            
        }
    }

}
