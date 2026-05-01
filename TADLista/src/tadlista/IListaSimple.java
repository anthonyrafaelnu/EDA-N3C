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
    
    /*
    PRE: La lista está ordenada
    POS: Agrega un elemento de forma ordenada a la lista
    */
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
    
    
    // Ejercicios práctico 7
    
    /*
    Pre: La lista no es vacía.
    Pos: Retorna el máximo elemento de la lista
    */
    T maximo ();
    
    /*
    Pos: Retorna la cantidad de veces que aparece el elemento pasado como parámetro en la lista.
    */
    int contar (T elem);

    /*
    Pos: Retorna true sii la lista está ordenada.
    */
    boolean estaOrdenada ();

    
}
