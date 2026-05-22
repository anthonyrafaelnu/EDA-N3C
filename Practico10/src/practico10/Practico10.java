package practico10;

public class Practico10 {

    public static void main(String[] args) {
        //System.out.println("2^4: " + pot(2,4));
        //mostrarDesc(6); // 6 5 4 3 2 1
        //mostrarAsc(6); // 1 2 3 4 5 6
        mostrarAscV2(6, 1); // 1 2 3 4 5 6
        System.out.println("");
    }
    
    /*
    PRE: base y exp son naturales mayores que 0
    */
    public static int pot(int base, int exp){
        if(exp == 1){ // Caso base (CB)
            return base;
        }else{
            return base * pot(base, exp - 1);
        }
    }
    
    public static void mostrarDesc(int n){
        if(n == 1){
            System.out.print(1);
        }else{
            System.out.print(n + " ");
            mostrarDesc(n - 1);
        }
    }
    
    public static void mostrarAsc(int n){
        if(n == 1){
            System.out.print(1 + " ");
        }else{
            mostrarAsc(n - 1);
            System.out.print(n + " ");
        }
    }
    
    public static void mostrarAscV2(int n, int numActual){
        if(numActual == n){
            System.out.print(n);
        }else{
            System.out.print(numActual + " ");
            mostrarAscV2(n, numActual + 1);
        }
    }
    
}
