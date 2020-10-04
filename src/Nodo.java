
public class Nodo {
     
    public int elemento;
    public Nodo siguiente;
    
    public Nodo(int elemento, Nodo siguiente){
        this.elemento = elemento;
        this.siguiente = siguiente;
    }
    
    public Nodo(){
    }
 
    public int getElemento() {
        return elemento;
    }
 
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }
 
    public Nodo getSiguiente() {
        return siguiente;
    }
 
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
 
    public String toString() {
        return elemento+" ";
    }
     
     
     
}
