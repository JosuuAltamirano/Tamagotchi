package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static  int saciedad = 6;
    static  int energia = 6;
    static  int diversion = 6;

    public static void main(String[] args) {
        System.out.println("¡Hola git!");
        int opcion = menuPrincipal();
        if(opcion == 1) {
            mostrarEstado();
        }
    }

    private static int menuPrincipal(){
        Scanner sc = new Scanner (System.in);
        int opcion;

        do {
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("------------");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción del menú: ");

            opcion = sc.nextInt();

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion < 0 || opcion > 4);
        return opcion;
    }
    private static void mostrarEstado(){
    //Fin del juego
         if(saciedad == 0 || energia == 0 || diversion == 0){
            System.out.println("(x_x) :( Game Over ):");
            System.out.println("/|_|\\");
            System.out.println(" | |");
        }
    //Contento
        else if(saciedad > 5 && energia >5 && diversion >5){
            System.out.println("(•‿•) ¡Estoy feliz!");
            System.out.println("/|_|\\");
                    System.out.println(" | |");
        }
    //Triste|aburrido
        else if(diversion <= 4){
            System.out.println("(-︵-) Estoy aburrido");
            System.out.println("/|_|\\ ¡Juega conmigo!");
            System.out.println(" / \\");
        }
    //Cansado
        else if(energia <= 4){
            System.out.println("(-_-) Zzz ");
            System.out.println("/|_|\\ ");
            System.out.println("// \\");
        }
        else if(saciedad <= 4){
            System.out.println("(._.) Tengo hambre");
            System.out.println("/|_|\\ ");
            System.out.println(" | |");
        }

    }
}