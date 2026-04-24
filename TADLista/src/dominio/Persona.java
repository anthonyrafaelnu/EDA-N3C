package dominio;

import java.util.Objects;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + 
               ", Apellido: " + apellido + 
               ", Edad: " + edad;
    }
    
    @Override
    public boolean equals(Object obj) {
        Persona p = (Persona)obj;
        
        return this.nombre == p.nombre &&
               this.edad == p.edad;
    }
    
    
}
