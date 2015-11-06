
package listas_dobles;

/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */ 
/**
 * Lista Doble con registro de empleados
 * 
 */
public class ListaDobleEmpleado {
    public EmpleadoDoble primero;
    public int tamano;
    public boolean esVacia(){
        if(primero==null){
            return true;
        }
        else{
            return false;
        }
    }
public void insertarNodo(String nombre, String apellido, int edad /*int tamano*/){  //Metodo de ingreso de datos a la lista
    EmpleadoDoble nuevoNodo=new EmpleadoDoble(nombre, apellido, edad/*, tamano*/);
    if(esVacia()){  //compara si o no vacia
        primero=nuevoNodo;
    }
    else{
        nuevoNodo.siguiente=primero;    //registra nuevo nodo
        primero.anterior=nuevoNodo;
        primero=nuevoNodo;
    }
    tamano++;
}
public void imprimeNodo(){  
   EmpleadoDoble nodoTemporal=primero;  //temporal nodo
    if(esVacia()){
        System.out.println("La lista esta vacia");
    }
    else{
        while(nodoTemporal!=null){  //necesario a que entre
        System.out.print("Nombre: "+nodoTemporal.nombre+"\nApellido: "+nodoTemporal.apellido+"\nEdad: "+nodoTemporal.edad+"\n");
        System.out.println();
        nodoTemporal=nodoTemporal.siguiente;
    }
   }     
}
public void eliminaNodo(){  
    //EmpleadoDoble nodoTemporal=primero;
    if(esVacia()){
        //while(nodoTemporal!=primero){
             System.out.println("La lista esta vacia"); 
    }
    else{
        primero=primero.siguiente;
        primero.anterior=null;
    }
}
// public void borrarElemento(String nombreBuscado){
//        
//        if(primero.nombre == nombreBuscado){//Escenario 1
//            primero = primero.siguiente;
//            primero.anterior = null;
//        }else{
//            EmpleadoDoble temp = primero;//Escenario 2
//            while(temp.siguiente != null){
//                if(temp.nombre == nombreBuscado){
//                    temp.siguiente.anterior = temp.anterior;
//                    temp.anterior.siguiente = temp.siguiente;
//                    break;
//                }
//                temp = temp.siguiente;
//            }
//            
//            if(temp.nombre == nombreBuscado){//Escenario 3
//                temp.anterior.siguiente = temp.siguiente;
//            }
//        }
//
//}
// public void buscar(String dato){
// if(primero.nombre==dato){
//            System.out.println(primero.nombre);
//        }
//        else{
//            EmpleadoDoble temp=primero;
//            while(temp.nombre!=null){
//                if(temp.nombre==dato){
//                    System.out.println(temp.nombre);
//                    break;
//                }
//            }
//            if(temp.nombre==dato){
//                System.out.println(temp.nombre);
//            }
//        }
// }
}
