
package lista_circular;

/**
 * @author 68NK7
 * @author David Gutierrez/Steven Rojas
 * @version Listas Simples
 */ 
public class PersonaCircular {
    public String nombre;
    public int edad;
    public int tamano;
    public PersonaCircular siguiente=null;
    public PersonaCircular anterior=null;
    public PersonaCircular(String nombre, int edad){//Guarda datos en campos
        this.nombre=nombre;
        this.edad=edad;
    }
}