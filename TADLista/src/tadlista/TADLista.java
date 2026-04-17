package tadlista;

public class TADLista {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        
        l.agregarInicio(3);
        l.agregarInicio(1);
        l.agregarInicio(6);
        
        l.mostrar();
        System.out.println("Cantidad de elementos: " + l.cantElementos());
        
        l.agregarFinal(9);
        l.mostrar();
        System.out.println("Cantidad de elementos: " + l.cantElementos());
        
        l.borrarFin();
        l.mostrar();
        System.out.println("Cantidad de elementos: " + l.cantElementos());
    }
    
}
