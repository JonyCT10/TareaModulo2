/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

import java.util.ArrayList;
import java.util.List;
public class Recursos {
    
    public static void main(String[] args) {   
        
     Recursos damemensaje= new Recursos();
     String dame_bienvenida=damemensaje.retornar_Mensaje();
     String ejemplo_edad= damemensaje.retornar_Edad(23);
     int dame_multi=damemensaje.retornar_Multi(3, 5);
     List<Integer> dame_numeros=damemensaje.retornar_Lista(22);
     
     System.out.println(dame_bienvenida);
     System.out.println(ejemplo_edad);
     System.out.println(dame_multi);
     System.out.println(dame_numeros);
     
    }
    
    public String retornar_Mensaje(){
       return("Programacion Orientada A Objetos 2025");
    }
    
    
    public String retornar_Edad(int edad){
        if (edad>=21){
        return ("Mayor de edad");
        }
        else{
        return ("Menor de edad");
        }      
    }
    
    public int retornar_Multi(int num1, int num2){
        int resultado=num1*num2;
        return resultado;
    }
    
    public List<Integer> retornar_Lista(int x){
     List<Integer> numeros= new ArrayList<>();
         for (int i=1;i<=x;i++){
          numeros.add(i);
          }
            return numeros;
    }
}
