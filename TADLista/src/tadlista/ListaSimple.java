package tadlista;

public class ListaSimple<T extends Comparable> implements IListaSimple<T>{
    private Nodo<T> lista;
    private Nodo<T> fin;
    private int cantidad;

    public ListaSimple() {
        this.lista = null;
        this.fin = null;
        this.cantidad = 0;
    }

    @Override
    public boolean esVacia() {
         return this.fin == null;
    }

    @Override
    public void agregarInicio(T n) {
        Nodo<T> nuevo = new Nodo(n);
        
        nuevo.setSiguiente(this.lista);
        this.lista = nuevo;
        
        if(this.esVacia()){
            this.fin = nuevo;
        }
        
        this.cantidad++;
    }

    @Override
    public void agregarFinal(T n) {
        if(this.esVacia()){
            this.agregarInicio(n);
        }else{
            Nodo<T> nuevo = new Nodo(n);
            nuevo.setSiguiente(null);
            this.fin.setSiguiente(nuevo);
            this.fin = nuevo;
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarInicio() {
        if(!this.esVacia()){
            if(this.lista.getSiguiente() == null){ // Hay solo un nodo
                this.vaciar();
            }else{
                Nodo<T> aBorrar = this.lista;
                this.lista = this.lista.getSiguiente();
                aBorrar.setSiguiente(null);
                this.cantidad--;
            }
        }
    }

    @Override
    public void borrarFin() {
        if(!this.esVacia()){
            
            if(this.lista.getSiguiente() == null){ // Hay solo un nodo
                this.vaciar();
            }else{
                Nodo<T> aux = this.lista;
                
                while(aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                
                this.fin = aux;
                aux.setSiguiente(null);
                
                this.cantidad--;
            }
            
        }
    }

    @Override
    public void vaciar() {
        this.lista = null;
        this.fin = null;
        this.cantidad = 0;
    }

    @Override
    public void mostrar() {
        Nodo<T> aux = this.lista;
        
        while(aux != null){
            System.out.print(aux.getDato() + " ");
            aux = aux.getSiguiente();
        }
        System.out.println("");
    }

    @Override
    public void agregarOrd(T n) {
        if(this.esVacia() || n.compareTo(this.lista.getDato()) <= 0){
            this.agregarInicio(n);
        }else if(n.compareTo(this.fin.getDato()) >= 0){
            this.agregarFinal(n);
        }else{
            Nodo<T> nuevo = new Nodo(n);
            Nodo<T> aux = this.lista;
            
            while(aux.getSiguiente().getDato().compareTo(n) < 0){
                aux = aux.getSiguiente();
            }
            
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
            
            this.cantidad++;
        }
    }

    @Override
    public void borrarElemento(T n) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int cantElementos() {
        return this.cantidad;
    }

    @Override
    public boolean pertenece(T n) {
        Nodo<T> aux = this.lista;
        
        while(aux != null && !aux.getDato().equals(n)){
            aux = aux.getSiguiente();
        }
        
        return aux != null;
    }

    @Override
    public T obtenerElemento(int indice) {
        int pos = 0;
        Nodo<T> aux = this.lista;
        
        while(pos != indice){
            aux = aux.getSiguiente();
            pos++;
        }
        
        return aux.getDato();
    }

    @Override
    public void mostrarREC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    @Override
    public T maximo() {
        T max = this.lista.getDato();
        
        Nodo<T> aux = this.lista.getSiguiente();
        
        while(aux != null){
            if(aux.getDato().compareTo(max) > 0){
                max = aux.getDato();
            }
            aux = aux.getSiguiente();
        }
        
        return max;
    }

    @Override
    public int contar(T elem) {
        int contador = 0;
        
        Nodo<T> aux = this.lista;
        
        while(aux != null){
            if(aux.getDato().equals(elem)){
                contador++;
            }
            aux = aux.getSiguiente();
        }
        
        return contador;
    }

    @Override
    public boolean estaOrdenada() {
        
        if(this.cantidad <= 1) return true;
        
        Nodo<T> aux = this.lista;
        
        while(aux.getSiguiente() != null){
            if(aux.getDato().compareTo(aux.getSiguiente().getDato()) > 0) return false;
            aux = aux.getSiguiente();
        }
        
        return true;
    }
    
}