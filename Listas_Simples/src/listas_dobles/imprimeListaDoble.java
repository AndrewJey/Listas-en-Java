/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_dobles;
import java.util.*;
/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */ 
/**
 * Lista Doble con registro de empleados
 * 
 */
public class imprimeListaDoble {
    public static void main(String []args){
        ListaDobleEmpleado instancia=new ListaDobleEmpleado();
        Scanner entrada=new Scanner (System.in);
        String opcion1; //Variable para las sentencias
        int opcion2;    //Variable para las sentencias
        do{
            System.out.println("listas dobles".toUpperCase());
            System.out.println();
            System.out.println("1. Ingresar Nodo a lista");
            System.out.println("2. Imprimir informacion de lista");
            System.out.println("3. Elminar Nodo");
//            System.out.println("4. Buscar");
            System.out.println("4. Salir");
            System.out.println();
            System.out.print("Ingrese una Opcion: ");
            opcion2=entrada.nextInt();
            System.out.println();
            switch(opcion2){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre=entrada.next();
                    System.out.println();
                    System.out.print("Ingrese el apellido: ");
                    String apellido=entrada.next();
                    System.out.println();
                    System.out.print("Ingrese la edad: ");
                    int edad=entrada.nextInt();
                    System.out.println();
                    instancia.insertarNodo(nombre, apellido, edad);  
                    break;
                case 2:
                    System.out.println("Informacion de la Lista");
                    System.out.println();
                    instancia.imprimeNodo();
                    break;
                case 3:
                    System.out.println("Ultimo Nodo igresado borrado!");
                    instancia.eliminaNodo();
                    break;
//                case 4:
//                    System.out.print("Ingrese el nombre a buscar: ");
//                    System.out.println();
//                    String nombre2=entrada.next();
//                    instancia.buscar(nombre2);
//                    
//                    
//                    break;
                case 4:
                    break;
            }
            System.out.println();
            System.out.print("Ingrese \'Y\' para volver al menu\nsino 3 para salir del sistema: ");
            opcion1=entrada.next();
            System.out.println();
        }while(opcion1.equals("y")||opcion1.equals("Y"));
        //System.out.println();
    }
}
