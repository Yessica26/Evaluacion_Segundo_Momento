/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_Seg_momen;

import java.util.ArrayList;
import java.util.Scanner;

public class PuntoUno {
    
    /*Cree una funcionalidad  que guarde en un array 6 nombres de compañeros, cree un ciclo que permita recorrerlo, 
        muestre la extensión del mismo. Capture los nombres mediante el sistema.*/

    
    public static void main (String []args){
        
        Scanner sc= new Scanner (System.in);
        ArrayList<String> names=new ArrayList<String>();
        
        System.out.println("Nombre A1umno 1:" );
        String name1=sc.nextLine();
        names.add(name1);
        
        System.out.println("Nombre A1umno 2:" );
        String name2=sc.nextLine();
        names.add(name2);
        
        System.out.println("Nombre A1umno 3:" );
        String name3=sc.nextLine();
        names.add(name3);
        
        System.out.println("Nombre A1umno4:" );
        String name4=sc.nextLine();
        names.add(name4);
        
        System.out.println("Nombre A1umno5:" );
        String name5=sc.nextLine();
        names.add(name5);
        
        System.out.println("Nombre A1umno6:" );
        String name6=sc.nextLine();
        names.add(name6);
        
        System.out.println("Nombres"+ names.toString());
        for (int i=0; i<names.size();i++){
            System.out.println("Nombre \n "+ names.get(i));
        }
        
    }
        
}      
        

