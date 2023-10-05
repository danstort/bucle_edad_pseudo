/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucle_edad;

import java.util.Scanner;

/**
 *
 * @author danielsotoortiz
 */
public class Bucle_edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, lug;
        int edad;
        
        Scanner tec = new Scanner(System.in);
        nombre = "algo";

        while (!nombre.equals("fin")) {
            int pag = 0;
            System.out.println("Introduce tu nombre ");
            nombre = tec.nextLine();
            if (!nombre.equals("fin")) {
                System.out.println("Introduce tu lugar de nacimiento");
                lug = tec.nextLine();
                System.out.println("Introduce edad");
                edad = tec.nextInt();
                tec.nextLine();
                

                if (edad >= 1 && edad <= 50) {
                    pag = pag + 50;

                }
                
                if (edad > 50) {
                    pag = pag + 70; 

                }
                
                if (lug.equals("Cáceres")){
                    pag = pag + 20;
                }
                
                System.out.println("");
                System.out.println(nombre+ " tiene que pagar "+pag+" euros");
                System.out.println("");
            }

        }
    }

}
