package tadlista;

import dominio.Persona;

public class TADLista {

    public static void main(String[] args) {
        ListaSimple l = new ListaSimple();
        
        l.agregarInicio(3);
        l.agregarInicio(6);
        l.agregarInicio(3);
        l.agregarInicio(1);
        
        //l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());
//        
//        l.agregarFinal(9);
//        l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());
//        
//        l.borrarFin();
//        l.mostrar();
//        System.out.println("Cantidad de elementos: " + l.cantElementos());

        //ListaSimple personas = new ListaSimple();
        
        //persona p1 = new Persona("Rafa", "Núñez", 24);
        //Persona p3 = new Persona("Rafa", "Núñez", 24);
        //Persona p2 = new Persona("Pepe", "Gomez", 26);
        
        //personas.agregarInicio(p1);
        //personas.agregarInicio(p2);
        
        //personas.mostrar();
        
        //System.out.println("Persona p3 pertenece: " + personas.pertenece(p3));
        
        ListaSimple lOrdenada = new ListaSimple();
        
        lOrdenada.agregarOrd(5);
        lOrdenada.agregarOrd(3);
        lOrdenada.agregarOrd(6);
        lOrdenada.agregarOrd(1);
        lOrdenada.agregarOrd(-3);
        
        //lOrdenada.mostrar();
        
        //System.out.println("Máximo de lista l: " + l.maximo());
        //System.out.println("Cantidad de número 3: " + l.contar(3));
        
        System.out.println("La lista l está ordenada: " + l.estaOrdenada());
        System.out.println("La lista lOrdenada está ordenada: " + lOrdenada.estaOrdenada());
    }
    
}
