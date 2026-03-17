package prueba;

public class Prueba {

    public static void main(String[] args) {
        //prueba();
        //ej2(1,7);
        //imprimirImparesHastaN(4);
        //imprimirNumero(1523);
        imprimirNumeroV4(1523);
    }
    
    public static void prueba(){
        int a = 5;
        int b = ++a;
        int[] array = new int[200];
        
        int valor = array[145];
        
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
    }

    public static void imprimirImparesV1(){
        for (int i = 1; i <= 50; i++) {
            if(i % 2 != 0){ // Solo entro si es impar
                System.out.print(i + " ");
            }
        }
    }
    
    public static void imprimirImparesV2(){
        for (int i = 1; i <= 50; i+=2) {
            System.out.print(i + " ");
        }
    }
    
    public static void ej2(int num1, int num2){
        double prom = (num1 + num2) / 2.0;
        System.out.println("Promedio: " + prom);
        
        int cantPares = 0;
        
        int minimo = Math.min(num1, num2);
        int maximo = Math.max(num1, num2);
        
        for (int i = minimo + 1; i < maximo; i++) {
            if(i % 2 == 0){
                cantPares++;
            }
        }
        
        System.out.println("Cantidad de pares: " + cantPares);
    }
    
    public static void imprimirImparesHastaN(int n){
        
        int i = 0;
        int contador = 1;
        
        while(i < n){
            System.out.print(contador + " ");
            contador += 2;
            i++;
        }
    }
    
    public static void imprimirNumero(int n){
        String cadena = String.valueOf(n);
        //String cadena = n + "";
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");
        }
    }
    
    public static void numInvertido(int n){
        String cadena = String.valueOf(n);
        String res = "";
        
        for (int i = 0; i < cadena.length(); i++) {
            int ultimoDigito = n%10;
            n = n / 10;
            res += " " + ultimoDigito;
        }
        
        System.out.println(res);
    }
    
    public static void imprimirNumeroV2(int n){
        String cadena = String.valueOf(n);
        //String cadena = n + "";
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(cadena.length() - 1 - i) + " ");
        }
    }
    
    public static void imprimirNumeroV3(int n){
        String cadena = String.valueOf(n);
        //String cadena = n + "";
        
        for (int i = cadena.length() - 1; i >= 0; i--) {
            System.out.print(cadena.charAt(i) + " ");
        }
    }
    
    public static void imprimirNumeroV4(int n){
        String cadena = String.valueOf(n);
        
        int pos = cadena.length() - 1;
        
        while(pos >= 0){
            System.out.print(cadena.charAt(pos) + " ");
            pos--;
        }
    }
}
