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
public class Palabras {
    String[] palabras=
    {"perro", "gato", "rata", "hamster", "elefante", "mono", "rinoceronte", "golondrina", "pez", 
        "tigre", "leon", "puma", "leopardo", "jaguar", "mosquito", "mosca", "cucaracha", "escarabajo",
    "cobaya", "foca"};
   
   
    int numAleatorio=(int)(Math.random()*20)-1;
    String palabraAleatoria=palabras[numAleatorio];
   
    
}
