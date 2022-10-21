/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_luismendoza;

import java.util.Scanner;


public class Lab2P1_LuisMendoza {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcionUsuario;
        int opcionUsuario1;
        int opcionUsuario3;
        int C;
        
            do{
            System.out.println("Bienvenido al programa Lab #2!");
            System.out.println("Elija una opción: ");
            System.out.println("1. Ejercicio #1, 2. Ejercicio #2, 3. Ejercicio #3, 4. Salir");
            opcionUsuario = entrada.nextInt();
            
            if (opcionUsuario == 1){
                do{
                    System.out.println("Bienvenido al programa de MCD: ");
                    System.out.println("Ingre una de las opciones: ");
                    System.out.println("1. Comenzar, 2. Salir");
                    opcionUsuario1 = entrada.nextInt();
                    
                    if (opcionUsuario1 == 1){
                        System.out.println("Ingrese el numero A: ");
                        int A = entrada.nextInt();
                        System.out.println("Ingrese el numero B: ");
                        int B = entrada.nextInt();
                        
                        while (A != B){
                            if (A > B){
                                A = A - B;
                            } else if (B > A){
                                B = B - A;
                            }
                        } 
                        System.out.println("El MCD es : ");
                        System.out.println(A);
                        
                        
                        
                        
                        
                        
                    } else if (opcionUsuario1 == 2){
                        break;
                    } else{
                        System.out.println("Opción no valida!");
                    }
                    
                    
                }while(true);
                
                
                
                
            } else if (opcionUsuario == 2){
                
                
                System.out.println("Ingrese su edad: ");
                int edad = entrada.nextInt();
                
                if ((edad >= 2013) && (edad <= 2025)){
                    System.out.println("Usted es de la generación Alpha");
                } else if ((edad >= 1964) && (edad <= 1979)){
                    System.out.println("Usted es de la generación X");
                } else if ((edad >= 1980) && (edad <= 1985)){
                    System.out.println("Usted es de la generación Xennials");
                } else if ((edad >= 1986) && (edad <= 1994)){
                    System.out.println("Usted es de la generación Millenials");
                } else if ((edad >= 1995) && (edad <= 2012)){
                    System.out.println("Usted es de la generación Z");
                } else {
                    System.out.println("Generación no nombrada.");
                }
                    
                        
            }else if (opcionUsuario == 3) {
                do{ 
                    System.out.println("Bienvenido a las batallas Pokemon!");
                    System.out.println("Elija una opción: ");
                    System.out.println("1. Batalla, 2. Salir");
                    opcionUsuario3 = entrada.nextInt();
                    
                    if (opcionUsuario3 == 1){
                        System.out.println("Ingrese el tipo de pokemon para el atacante: ");
                        System.out.println("1. Figthing, 2. Psychic, 3. Steel, 4. Fairy");
                        int pokemonAtacante = entrada.nextInt();
                        
                        System.out.println("Ingrese el tipo de pokemon para el defensor: ");
                        System.out.println("1. Figthing, 2. Psychic, 3. Steel, 4. Fairy");
                        int pokemonDefensor = entrada.nextInt();
                        
                        if ((pokemonAtacante == 1) && (pokemonDefensor == 1)){
                            System.out.println("El ataque fue neutral...");
                        } else if((pokemonAtacante == 1) && (pokemonDefensor == 2)) {
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 1) && (pokemonDefensor == 3)){
                            System.out.println("MUY EFECTIVO SU ATAQUE!");
                        } else if ((pokemonAtacante == 1) && (pokemonDefensor == 4)){
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 2) && (pokemonDefensor == 1)){
                            System.out.println("MUY EFECTIVO SU ATAQUE!");
                        } else if((pokemonAtacante == 2) && (pokemonDefensor == 2)){
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 2) && (pokemonDefensor == 3)){
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 2) && (pokemonDefensor == 4)){
                            System.out.println("Su ataque fue neutral...");
                        } else if((pokemonAtacante == 3) && (pokemonDefensor == 1)){
                            System.out.println("Su ataque fue neutral...");
                        } else if ((pokemonAtacante == 3) && (pokemonDefensor == 2)){
                            System.out.println("Su ataque fue neutral");
                        } else if((pokemonAtacante == 3) && (pokemonDefensor == 3)){
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 3) && (pokemonDefensor == 4)){
                            System.out.println("MUY EFECTIVO SU ATAQUE!");
                        } else if((pokemonAtacante == 3) && (pokemonDefensor == 1)){
                            System.out.println("MUY EFECTIVO SU ATAQUE!");
                        } else if ((pokemonAtacante == 4) && (pokemonDefensor == 2)){
                            System.out.println("Su ataque fue neutral...");
                        } else if ((pokemonAtacante == 4) && (pokemonDefensor == 3)){
                            System.out.println("Su ataque fue deprimente");
                        } else if ((pokemonAtacante == 4) && (pokemonDefensor == 4)){
                            System.out.println("Su ataque fue neutral...");  
                    } else {
                            System.out.println("Opción no valida");
                        }
                       
                        
                    } else if (opcionUsuario3 == 2){
                        break;
                    }
                    
                } while(true);
                
            } else if (opcionUsuario == 4) {
                break;
            } else {
                System.out.println("Opción no valida!");
            }
        } while(true);
        
       
        
    }
    
}
