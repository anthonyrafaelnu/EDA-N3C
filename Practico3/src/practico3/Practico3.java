package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,7,2,4};
        int[] array2 = {6,3,5};
        
        int[] arrayOrdenado = {1,3,5,6,7,8,8,9,10};
        int[] arrayOrdenado2 = {1,2,8,11};
        
        //System.out.println(mostrarv(array));
        //System.out.printf("%2d", promedio(array2));
        //System.out.println("Promedio: " + promedio(array2));
        //System.out.println(muestroValoresImpares(array));
        //System.out.println(muestroPosPares(array));
        //System.out.println("Valor máximo: " + maxVec(array));
        //System.out.println("posMinVec: " + posMinVec(array, 0, 7));
        //System.out.println("buscarVecV2: " + buscarVecV2(arrayOrdenado, 3));
        //System.out.println("unirVectoresOrdenados: " + mostrarv(unirVectoresOrdenados(arrayOrdenado, arrayOrdenado2)));
    
        System.out.println(mostrarv(array));
        ordenarvec(array);
        System.out.println(mostrarv(array));
    }
    
    public static String mostrarv(int[] v){
        String ret = "";
        
        for (int i = 0; i < v.length - 1; i++) {
            ret += v[i] + " - ";
        }
        
        ret += v[v.length - 1];
        
        return ret;
    }
    
    public static double promedio(int []v){
        double suma = 0;
        
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        
        return suma/v.length;
    }
    
    public static String muestroValoresImpares(int v[]){
        String ret = "";
        
        for (int i = 0; i < v.length; i++) {
            if(v[i] % 2 != 0){
                ret += v[i] + " ";
            }
        }
        
        return ret;
    }
    
    public static String muestroPosPares(int v[]){
        String ret = "";
        
        for (int i = 0; i < v.length; i+=2) {
            ret += v[i] + " ";
        }
        
        return ret;
    }

     public static int maxVec(int []v){
        int max = v[0];

         for (int i = 0; i < v.length; i++) {
//             if(v[i] > max){
//                 max = v[i];
//             }
             
            max = (v[i] > max) ? v[i] : max;
         }
         
         

        return max;
     }
    
    public static boolean buscarVecV1(int []v, int elemento){
        boolean existe = false; //O(1)

        for (int i = 0; i < v.length && !existe; i++) { // O(n)
            if(v[i] == elemento){ // O(1)
                existe = true;
                //return true;
            }
        }

        //return false;
        return existe; // O(1)
    }
     
    /*
        PRE: Recibo un vector ordenado y un elemento
        POS: Retorna true si el elemento existe en el vector. False en caso contrario
    */
    public static boolean buscarVecV2(int []v, int elemento){
        int inicio = 0;
        int fin = v.length - 1;
        
        while(inicio <= fin){
            //int medio = (inicio + fin) / 2;
            int medio =  inicio + (fin-inicio)/2;
            
            if(v[medio] == elemento){
                return true;
            }else if(v[medio] < elemento){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        
        return false;
    }

    public static int [] unirVectoresOrdenados(int []v1, int []v2){
        int[] ret = new int[v1.length + v2.length];
        
        int posV1 = 0;
        int posV2 = 0;
        int posRet = 0;
        
        int largoV1 = v1.length;
        int largoV2 = v2.length;
        
        // Mientras ambos tengan elementos, a la vez
        while(posV1 < largoV1 && posV2 < largoV2){
            if(v1[posV1] <= v2[posV2]){
                ret[posRet] = v1[posV1];
                posV1++;
            }else{
                ret[posRet] = v2[posV2];
                posV2++;
            }
            posRet++;
        }
        
        while(posV1 < largoV1){
            ret[posRet] = v1[posV1];
            posV1++;
            posRet++;
        }
        
        while(posV2 < largoV2){
            ret[posRet] = v2[posV2];
            posV2++;
            posRet++;
        }
        
        // ! (posV1 < largoV1 && posV2 < largoV2)
        // posV1 >= largoV1 || posV2 >= largoV2
        
        return ret;
    }

    /*
        PRE: Recibe un vector y dos posiciones válidas (ambas mayores o iguales que 0
             y menores al largo del array, y posDesde <= posHasta)
        POS: Retorna la posición donde se encuentra el mínimo elemento del array.
     */
    public static int posMinVec(int []v, int posDesde, int posHasta){
       int min = v[posDesde];
       int posMin = posDesde;

       for (int i = posDesde + 1; i <= posHasta; i++) {
           if(v[i] < min){
               min = v[i];
               posMin = i;
           }
       }

       return posMin;
    }
    
    public static void ordenarvec(int []v){
        for (int i = 0; i < v.length; i++) { // O(n)
            int posMin = posMinVec(v, i, v.length - 1); // O(n)
            
            int aux = v[i];
            v[i] = v[posMin];
            v[posMin] = aux;
        }
    }
}