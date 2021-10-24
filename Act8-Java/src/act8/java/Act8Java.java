package act8.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Act8Java {


    public static void main(String[] args) {
        
        Scanner line = new Scanner(System.in);
        
        int op;
        boolean jugar = true;
        
        
        Deck deck = new Deck();
        System.out.println("Deck de Cartas para Iniciar: " + deck.getSize());
       
        //Iniciamos el juego
        
                  System.out.println("\n");
                  deck.shuflle();
                  System.out.println("\n");
                  deck.head();
                  System.out.println("\n");
                  deck.pick();
                  System.out.println("\n");
                  deck.hand();
            
            if(deck.getSize() == 0){
                
                jugar = false;
                System.out.println("Ya no hay cartas.");  
        }
        
        System.out.println("El juego ha terminado.");
    
    
    
    }
}
