/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_Seg_momen;

import java.util.Scanner;

public class PuntoSeisSiete {
    

public static void main(String[]args){
    
   
  Scanner scanner = new Scanner(System.in);

        int[] num = new int[7];
       
        
        int contador = 0;

       do {
           System.out.print("Por favor ingresar el #:");
           int numerosIngresados = scanner.nextInt();
           num[contador] = numerosIngresados;
           contador++;
           
           
        } while (contador < 7);

        System.out.println("Los números ingresados son:");
        
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}