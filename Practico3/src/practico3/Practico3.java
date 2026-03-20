package practico3;

public class Practico3 {

    public static void main(String[] args) {
        int[] array = {6,3,5,1,8,7,2,4};
        int[] array2 = {6,3,5};
        
        //System.out.println(mostrarv(array));
        //System.out.printf("%2d", promedio(array2));
        //System.out.println("Promedio: " + promedio(array2));
        //System.out.println(muestroValoresImpares(array));
        //System.out.println(muestroPosPares(array));
        System.out.println("Valor máximo: " + maxVec(array));
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
    
}
