/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular;  //LISTA CIRCULAR SIMPLE 
//tomar en cuenta que como es simple solo lleva hacia un lado no es doble

/**
 *
 * @author 68NK7
 * @author David Gutierrez Solano
 */
public class ListaCircularSimple {
    public PersonaCircular primero=null;
    public boolean esVacia(){   //Comprobar el estado
        if(primero==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertarNodo(String nombre, int edad){
        PersonaCircular nuevoNodo=new PersonaCircular(nombre, edad);
        if(esVacia()){
            primero=nuevoNodo;
            primero.siguiente=primero;
        }
        else{
            PersonaCircular auxiliar=primero;
            while(auxiliar.siguiente!=primero){
                auxiliar=auxiliar.siguiente;
            }
            nuevoNodo.siguiente=primero;
            primero.anterior=nuevoNodo;
            primero=nuevoNodo;
        }
    }
    public void imprimirNodo(){
        PersonaCircular auxiliar=primero;
        if(esVacia()){
            System.out.println("lista vacia".toUpperCase());
        }
        else{
            while(auxiliar.siguiente!=primero){
                System.out.print("Nombre: "+auxiliar.nombre+"\nEdad: "+auxiliar.edad);
                auxiliar=auxiliar.siguiente;
            }
        }
    }
    public void eliminarNodo(){
        if(esVacia()){
           System.out.println("lista vacia".toUpperCase()); 
        }
        else if(primero.siguiente==primero){
            primero=null;
        }
        else{
            PersonaCircular auxiliar=primero;
            while(auxiliar.siguiente!=primero){
                auxiliar=auxiliar.siguiente;
            }
            auxiliar.siguiente=auxiliar.siguiente.siguiente;
            primero=auxiliar.siguiente.siguiente;
        }
    }
//    public boolean eliminaNodo(){
//        
//    }
    
}

