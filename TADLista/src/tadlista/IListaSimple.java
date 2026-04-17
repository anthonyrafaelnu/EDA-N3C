package tadlista;

public interface IListaSimple {
    /*
    PRE: -
    POS: Retorna true si la lista es vacía, false en caso contrario.
    */
    public boolean esVacia();
    
    public void agregarInicio(int n);
    
    public void agregarFinal(int n);
    
    public void borrarInicio();
    
    public void borrarFin();
    
    public void vaciar();
    
    public void mostrar();
    
    public void agregarOrd(int n);
    
    public void borrarElemento(int n);
    
    public int cantElementos();
    
    /*
    PRE: Índice es un valor entre 0 y cantidad de elementos - 1
    POS: Devuelve el elemento en el índice.
    */
    public int obtenerElemento(int indice);
    
    public void mostrarREC();
}
