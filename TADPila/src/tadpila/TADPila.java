package tadpila;

public class TADPila {

    public static void main(String[] args) {
        Pila p = new Pila();
        
        p.apilar(5);
        p.apilar(1);
        p.apilar(3);
        p.apilar(7);
        
        p.mostrar();
    }
    
}
