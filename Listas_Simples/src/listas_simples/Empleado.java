
package listas_simples;
/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */
public class Empleado { //se crea la lista(campos que tendra)
    public String nombre;   //variables 
    public String apellido;
    public int edad;
    //public int tamano;
    public Empleado siguiente;
    
    public Empleado(String nombre, String apellido, int edad /*int tamano*/){//Guarda datos en campos
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
       // this.tamano=tamano;
    }  
}
