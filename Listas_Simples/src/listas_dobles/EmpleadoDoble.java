
package listas_dobles;

/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */ 
public class EmpleadoDoble {
    public String nombre;
    public String apellido;
    public int edad;
   // public int tamano;
    public EmpleadoDoble siguiente=null;
    public EmpleadoDoble anterior=null;
    public EmpleadoDoble(String nombre, String apellido, int edad /*int tamano*/){//Guarda datos en campos
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        //this.tamano=tamano;
    }
}
    
