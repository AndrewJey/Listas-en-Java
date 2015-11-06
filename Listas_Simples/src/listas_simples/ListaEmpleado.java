
package listas_simples;
//import java.util.*;
/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */
/**
 * Lista simple con registro de empleados
 * 
 */
public class ListaEmpleado {
    public Empleado primero;
    //public Empleado anterior;
    public Empleado fin;
    public boolean esVacia(){
        if(primero==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void insertaNodo(String nombre, String apellido, int edad/*, int tamano*/){
        Empleado nuevoNodo=new Empleado(nombre, apellido, edad/*, tamano*/);
        if(esVacia()){
            primero=nuevoNodo;
        }
        else{
            nuevoNodo.siguiente=primero;
            primero=nuevoNodo;
        }        
    }
    public void imprimirNodo(){
        Empleado temporal=primero;
    if(esVacia()){
        System.out.println("La lista esta vacia");
    }
    else{
        while(temporal!=null){
            System.out.print("Nombre: "+temporal.nombre+"\nApellido: "+temporal.apellido+"\nEdad: "+temporal.edad+"\n");
            System.out.println();
            temporal=temporal.siguiente;
        }
    }
    }
    public void eliminarNodo(){
        if(!esVacia()){
           primero=primero.siguiente;
        }
    }
    //Metodo para buscar un nodo en especifico
//    public boolean buscarNodo(String nombreBuscar){
//        Empleado aux=primero;
//        while(aux!=null && aux.nombre!=nombreBuscar){
//            aux=aux.siguiente;
//        }
//        return aux!=null;
////        
//    
//    }
//    //Metodo para eliminar un nodo en especifico
//    public void eliminaNodo(String dato){
//        if(!esVacia()){ //Decimos que si esta vacio entre a la condicion
//        if (primero==fin && dato==primero.nombre){  //Primero esenario, si es el primero nodo lo elimina
//           primero=fin=null;
//        }
//        else if(dato==primero.nombre){  //Segundo esenario, si no es el primer nodo, sino el que sigue, lo elimina el nodo
//            primero=primero.siguiente;
//        }
//        else{   //Tercer esenario, si no es ni el primero ni segundo, el codigo sigue buscando en la lista mediante un while hasta que lo encuentra
//            Empleado anterior;  //Creo un anterior de la clase para usarlo solo aqui
//            Empleado temporal;  //Creo un temporal en el nodo para usarlo aqui
//            anterior=primero;   //Le ordeno que el anterior me iguale al primero
//            temporal=primero.siguiente; //Ordeno que el temporal sea igual al nodo que sigue del primero.
//            while(temporal!=null && temporal.nombre!=dato){ //Recorro la lista hasta que se cumpla las condiciones del while
//                anterior=anterior.siguiente;    //Elimno el nodo diciendo que, anterior es igual al que sigue del anterior
//                temporal=temporal.siguiente;    //Como use el temoporal, le digo que sea igual al que sigue de el temporal
//            }
//            
//            if(temporal!=null){ //Aqui decimos que si el temporal fue distinto a null, (en el proceso anterior) es que ya encontro el nodo y entra a barrar
//                anterior.siguiente=temporal.siguiente;  //Barremos los enlaces de los nodos
//                
//                if(temporal==fin){  //Aqui es que si el temporal ya llego al final de la lista entonces ya termino el recorrido,
//                                    //es porque no encontro el dato en los otros nodos y el dato que busca es porque esta 
//                                    //al final de la lista en el ultimo nodo
//                    
//                    fin=anterior;   //Es porque el ultimo nodo es el que se busca, entonces decimos que el fin es igual al anterior
//                } 
//            } 
//        }    
//      }
//    }
}

