package practico2;

import java.util.Objects;

public abstract class Funcionario implements Comparable<Funcionario> {
    private String nombre;
    private String ci;

    public Funcionario(String nombre, String ci) {
        this.nombre = nombre;
        this.ci = ci;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }
    
    public abstract double calcularSueldo();
    
    public boolean ganaMas(Funcionario f){
        return this.calcularSueldo() > f.calcularSueldo();
    }

    // PRE: Debe recibir un Funcionario
    // POS: Me devuelve true si los funcionarios son igules, false en caso contrario.
    @Override
    public boolean equals(Object obj) {
        Funcionario f = (Funcionario) obj;
        return this.ci.equals(f.ci);
    }

    @Override
    public int compareTo(Funcionario o) {
        return (int)(this.calcularSueldo() - o.calcularSueldo());
    }
    
    //f1.compareTo(f2);
    // 0 (son iguales)
    // 1 (es mayor)
    // -1 (es menor)
    
}
