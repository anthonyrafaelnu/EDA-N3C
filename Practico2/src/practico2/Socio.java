package practico2;

public class Socio {
    private String nombre;
    private int numero;
    private static int proximoNumero = 1;

    public Socio(String nombre) {
        this.nombre = nombre;
        this.numero = proximoNumero;
        proximoNumero++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getProximoNumero() {
        return proximoNumero;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Numero: " + numero;
    }
}
