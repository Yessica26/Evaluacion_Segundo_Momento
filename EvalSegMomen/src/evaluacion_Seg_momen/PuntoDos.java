/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_Seg_momen;

public class PuntoDos {
    public static void main (String []args){
        
        int [][] edad = {{33,8,66},{43,27,21,},{38,26,34}};
        
        System.out.println ("El tamaño de la matriz de Edades de mi familia es de: "+edad.length);
        
        for (int i= 0; i<edad.length; i++){
             
         for(int j = 0; j<edad[i].length; j++){
                    System.out.print(edad[i][j]+"\t");
                }
                System.out.println();
            } 
            
    }
    
}
