package tadlista;

import dominio.Persona;

public class TADLista {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        
        l.agregarInicio(3);
        l.agregarInicio(1);
        l.agregarInicio(6);
        
//        l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());
//        
//        l.agregarFinal(9);
//        l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());
//        
//        l.borrarFin();
//        l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());

        ListaSimple personas = new ListaSimple();
        
        Persona p1 = new Persona("Rafa", "Núñez", 24);
        Persona p3 = new Persona("Rafa", "Núñez", 24);
        Persona p2 = new Persona("Pepe", "Gomez", 26);
        
        personas.agregarInicio(p1);
        //personas.agregarInicio(p2);
        
        personas.mostrar();
        
        System.out.println("Persona p3 pertenece: " + personas.pertenece(p3));
    }
    
}
