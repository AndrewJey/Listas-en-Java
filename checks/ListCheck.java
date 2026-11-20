public class ListCheck {
 public static void main(String[] args) throws Exception {

 listas_simples.ListaEmpleado simple=new listas_simples.ListaEmpleado();simple.eliminarNodo();simple.insertaNodo("A","B",20);CheckSupport.check(simple.fin==simple.primero,"Tail initialized");simple.eliminarNodo();CheckSupport.check(simple.fin==null&&simple.primero==null,"Empty clears tail");
 listas_dobles.ListaDobleEmpleado doble=new listas_dobles.ListaDobleEmpleado();doble.insertarNodo("A","B",20);doble.eliminaNodo();CheckSupport.check(doble.esVacia(),"Delete singleton");CheckSupport.equal(doble.tamano,0);
 doble.insertarNodo("A","B",20);doble.insertarNodo("C","D",21);doble.eliminaNodo();CheckSupport.equal(doble.tamano,1);CheckSupport.check(doble.primero.anterior==null,"New head has no predecessor");
 lista_circular.ListaCircularSimple circular=new lista_circular.ListaCircularSimple();
 for(int i=0;i<30;i++)circular.insertarNodo("P"+i,i);
 for(int remaining=30;remaining>0;remaining--){
  lista_circular.PersonaCircular start=circular.primero,current=start;int n=0;
  do{current=current.siguiente;n++;CheckSupport.check(n<=remaining,"Circular traversal returns to head");}while(current!=start);
  CheckSupport.equal(n,remaining);circular.eliminarNodo();
 }
 CheckSupport.check(circular.esVacia(),"Circular emptied");

 CheckSupport.done();
 }
}
