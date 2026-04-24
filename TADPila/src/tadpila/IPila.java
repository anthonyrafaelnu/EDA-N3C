package tadpila;

public interface IPila<T> {
    /*
    PRE: -
    POS: Retorna true si la pila es vacía, false en caso contrario.
    */
    public boolean esVacia();
    
    public void apilar(T n);
    
    public void desapilar();
    
    /*
    PRE: La pila no es vacía
    POS: Retorna el elemento en el top de la pila
    */
    public T top();
    
    public void vaciar();
    
    public int cantElementos();
    
    
    // Función no válida, la dejamos a modo de desarrollo
    public void mostrar();
}
