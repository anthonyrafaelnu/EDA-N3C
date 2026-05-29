package practico10;

public class Practico10 {

    public static void main(String[] args) {
        //System.out.println("2^4: " + pot(2,4));
        //mostrarDesc(6); // 6 5 4 3 2 1
        //mostrarAsc(6); // 1 2 3 4 5 6
        //mostrarAscV2(6, 1); // 1 2 3 4 5 6
        //System.out.println("");
        //System.out.println("Factorial de 5: " + factorial(5)); // 120
        //System.out.println("Fibonacci de 6: " + fibV2(6)); // 8
        
        int[] v = {2, 3, 4, 1, 5}; // 15
        //System.out.println("Suma del vector: " + sumaVector(v));
        
        //System.out.println("Máximo de v: " + maximoValorVec(v)); // 5
        
        int[] vOrdenado = {2, 3, 5, 7, 9};
        System.out.println("Pertenece: " + pertenece(vOrdenado, 7));
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
    
    /*
    PRE: Recibe un natural n mayor o igual que 0
    POS: Retorna el factorial de n
    */
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    
    /*
    PRE: Recibe un natural mayor o igual que 0
    POS: Calcula fibonacci de ese n
    */
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    
    public static int fibV2(int n){
        if(n == 0 || n == 1) return n;
        
        int[] v = new int[n + 1];
        v[0] = 0;
        v[1] = 1;
        
        return fibV2Aux(n, v, 2);
    }

    public static int fibV2Aux(int n, int[] v, int pos){
        if(pos == n){
            return v[pos - 1] + v[pos - 2];
        }else{
            v[pos] = v[pos - 1] + v[pos - 2];
            return fibV2Aux(n, v, pos + 1);
        }
    }
    
    public static int sumaVector(int []v){
        return sumaVectorAux(v, 0);
    }
    
    public static int sumaVectorAux(int []v, int posV){
        if(posV == v.length - 1){
            return v[posV];
        }else{
            return v[posV] + sumaVectorAux(v, posV + 1);
        }
    }
    
    public static int maximoValorVec(int[] v){
        //if(v.length == 1) return v[0];
        //return maximoValorVecAux(v, 1, v[0]);
        return maximoValorVecAux2(v, 0);
    }
    
    public static int maximoValorVecAux(int[] v, int posV, int max){
        if(v.length == posV){
            return max;
        }else{
            if(v[posV] > max){
                max = v[posV];
            }
            return maximoValorVecAux(v, posV + 1, max);
        }
    }
    
    public static int maximoValorVecAux2(int[] v, int posV){
        if(posV == v.length - 1){
            return v[posV];
        }else{
            int max = v[posV];
            int maximoDelRestoDelVector = maximoValorVecAux2(v, posV + 1);
            
            if(max > maximoDelRestoDelVector) return max;
            return maximoDelRestoDelVector;
        }
    }
    
    public static boolean pertenece(int[] v, int n){
        //return perteneceAux(v, n, 0);
        return perteneceBinario(v, n, 0, v.length - 1);
    }
    
    public static boolean perteneceAux(int[] v, int n, int posV){
        if(posV == v.length){
            return false;
        }else{
            return (v[posV] == n) || perteneceAux(v, n, posV + 1);
        }
    }
    
    public static boolean perteneceBinario(int[] v, int n, int inicio, int fin){
        if(inicio > fin){
            return false;
        }
        
        int medio = (inicio + fin) / 2;
        
        if(v[medio] == n){
            return true;
        }
        
        if(n > v[medio]){
            return perteneceBinario(v, n, medio + 1, fin);
        }else{
            return perteneceBinario(v, n, inicio, medio - 1);
        }
    }
}
