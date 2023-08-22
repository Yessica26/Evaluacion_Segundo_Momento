/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion_Seg_momen;

/*Los siguientes son los datos de 3  jugadores de futbol: 
Jugador 1, Juan, “15 años”, delantero. 
Jugador 2: Pedro, “16 años” , defensa. 
Jugador 3: Luis , “17 años”, arquero. 

Cree una loop que imprima la información de los jugadores.

Indique la posición de arquero en el ejercicio anterior. Acceda al elemento.
Indique la posición de “16 años”. Acceda al elemento.

*/

public class PuntoTresCuatroCinco {
    
    public static void main (String []args){
        
        String [][] jugadores = {{":Jugador1Juan:", ":Jugador2Pedro:", ":Jugador3Luis:"},
            {"15 años","16 años","17años"},{"delantero","defensa","arquero"}};        
        
       System.out.println("---------------------");
       
       System.out.println("Tamaño de la matriz jugadores es:"+jugadores.length );
       
       System.out.println("--------------------");
       
       System.out.println("Posicion del arquero es[2][2]:"+jugadores[2][2]);
       
       System.out.println("Posicion de 16 años es[1][1]:"+jugadores[1][1]);
       
       System.out.println("--------------------");
        
              
         for (int i= 0; i<jugadores.length; i++){
             
             for(int j = 0; j<jugadores[i].length; j++){
             
                          
                    System.out.print(jugadores[i][j]+"\t");
                }
                System.out.println();
             
            
            } 
    }
    
}
