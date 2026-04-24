package tadlista;

public interface IListaSimple<T> {
    /*
    PRE: -
    POS: Retorna true si la lista es vacía, false en caso contrario.
    */
    public boolean esVacia();
    
    public void agregarInicio(T n);
    
    public void agregarFinal(T n);
    
    public void borrarInicio();
    
    public void borrarFin();
    
    public void vaciar();
    
    public void mostrar();
    
    public void agregarOrd(T n);
    
    public void borrarElemento(T n);
    
    public int cantElementos();
    
    public boolean pertenece(T n);
    
    /*
    PRE: Índice es un valor entre 0 y cantidad de elementos - 1, 
         la lista no puede ser vacía
    POS: Devuelve el elemento en el índice.
    */
    public T obtenerElemento(int indice);
    
    public void mostrarREC();
}
