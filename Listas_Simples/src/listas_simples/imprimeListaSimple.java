
package listas_simples;

import java.util.Scanner;

/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */ 
public class imprimeListaSimple {
    public static void main(String[]args){
        ListaEmpleado instancia=new ListaEmpleado();
        Scanner entrada=new Scanner(System.in);
        String opcion2;
        do{
        System.out.println("listas simples".toUpperCase());
        System.out.println();
        System.out.println("1. Insertar Nodo en Lista");
        System.out.println("2. Imprimir Lista");
        System.out.println("3. Eliminar Nodo");
//        System.out.println("4. Buscar");
//        System.out.println("5. Buscar y eliminar Nodo");
        System.out.println("4. Salir");
        System.out.println();
        System.out.print("Ingrese una opcion: ");
//        System.out.println();  
        int opcion=entrada.nextInt();
        System.out.println();
        switch (opcion){
            case 1:
//                System.out.println();
                System.out.print("Ingrese el nombre: ");
                String nombre=entrada.next();
                System.out.println();
                System.out.print("Ingrese el apellido: ");
                String apellido=entrada.next();
                System.out.println();
                System.out.print("Ingrese la edad: ");
                int edad=entrada.nextInt();
                //String edadCopia=String.valueOf(edad);
                instancia.insertaNodo(nombre,apellido, edad);
//                System.out.println();
                break;
            case 2:
                System.out.println("Informacion de la lista");
                System.out.println();
                instancia.imprimirNodo();
                break;
            case 3:
                System.out.println("Ultimo Nodo igresado borrado!");
                instancia.eliminarNodo();
                break; 
//            case 4:
//                System.out.print("Ingrese el nombre a buscar: ");
//                String nombreCopia=entrada.next();
//                System.out.println();
//                instancia.buscarNodo(nombreCopia);
//                if(instancia.buscarNodo(nombreCopia)){
//                    System.out.print("Nombre: "+nombreCopia+"\n");
//                }
//                else{
//                    System.out.print("El Nombre "+nombreCopia+" no fue encontrado");
//                }
//                System.out.println();
//            case 5:
//                System.out.print("Ingrese el nombre a buscar: ");
//                String nombreEli=entrada.next();
//                System.out.println();
//                if(instancia.buscarNodo(nombreEli)){
//                    instancia.eliminaNodo(nombreEli);
//                    System.out.print("Nombre: "+nombreEli+" a sido eliminado");
//                }
//                else{
//                    System.out.print("El Nombre "+nombreEli+" no fue encontrado");
//                }
//                System.out.println();
//                break;
                
            case 4:
                break;
        }
        System.out.println();
        //System.out.println();
        System.out.print("Ingrese \'Y\' para volver al menu\nsino 3 para salir del sistema: ");
        opcion2=entrada.next();
        System.out.println();
        }while(opcion2.equals("y") || opcion2.equals("Y")); 
        System.out.println();
    }        
}
