package repasoparcial1;

import tadCola.Cola;
import tadLista.ListaSimple;

public class RepasoParcial1 {

    public static void main(String[] args) {
        int[] v1 = {1, 4, 5, 8}; //m elementos
        int[] v2 = {1, 6, 9};   //n elementos
        
        //System.out.println("v1: ");
        //mostrarV(v1);
        
        //System.out.println("v2: ");
        //mostrarV(v2);
        
        //System.out.println("v3: ");
        //ret: [1, 1, 4, 5, 6, 8, 9]
        int[] v3 = unirVectores(v1, v2);
        //mostrarV(v3);
        
        int[] v4 = {1, 5, 2, 6, 1};
                                // 21 posiciones (desde la pos 0 a la pos 20)
        // array de boolean: [F, T, T, F, F, T ... F]

        int[] v5 = {5, 19, 4, 7, 2, 9};
        
        //System.out.println("Hay repetidos: " + hayRepetidos(v5));
        
        int[] v6 = {2, 5, 7, 6, 7, 5, 2};
        //System.out.println("Es palíndromo: " + esPalindromo2(v6));
        
        int[][] mat = {{2, 4, 5},
                       {1, 7, 4},
                       {9, 4, 3}};
                     //[12, 15, 12]
        
        int[][] mat2 = {{2, 4, 1},
                        {3, 7, 2},
                        {8, 4, 3}};
        
        //System.out.println("sumaDiagonalPrincipal: " + sumaDiagonalPrincipal(mat));
        //System.out.println("sumaDiagonalInversa: " + sumaDiagonalInversa(mat));
        //System.out.println("cantColsAscendentes: " + cantColsAscendentes(mat2));
        
        ListaSimple<Integer> l = new ListaSimple();
        l.agregarFinal(4);
        l.agregarFinal(5);
        l.agregarFinal(7);
        l.agregarFinal(23);
        l.agregarFinal(30);
        l.agregarFinal(39);
        
        l.mostrar();
        
        Cola c = l.listaACola();
        c.mostrar();
    }
    
    public static void mostrarV(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
    
    public static int[] unirVectores(int[] v1, int[] v2){ // O(m+n)
        int[] ret = new int[v1.length + v2.length];
        
        int pos = 0;
        int posV1 = 0;
        int posV2 = 0;
        
        //Estoy recorriendo ambos vectores a la vez
        while(posV1 < v1.length && posV2 < v2.length){
            if(v1[posV1] >= v2[posV2]){
                ret[pos] = v2[posV2];
                posV2++;
            } else {
                ret[pos] = v1[posV1];
                posV1++;
            }
            pos++;
        }
        
        //v1 todavía tiene datos
        while(posV1 < v1.length){
            ret[pos] = v1[posV1];
            posV1++;
            pos++;
        }
        
        //v2 todavía tiene datos
        while(posV2 < v2.length){
            ret[pos] = v2[posV2];
            posV2++;
            pos++;
        }
        
        return ret;
    }
    
    public static boolean hayRepetidos(int[] v){
        boolean[] aux = new boolean[21];
        
        for (int i = 0; i < v.length; i++) {
            
            // No estaba
            if(aux[v[i]] == false){
                aux[v[i]] = true;
            }else{
                // Ya estaba
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean esPalindromo(int[] v){  
        for (int i = 0; i < v.length / 2; i++) {
            if(v[i] != v[v.length - 1 - i]) return false;
        }
        
        return true;
    }
    
    public static boolean esPalindromo2(int[] v){  
        int[] vAux = new int[v.length];
        
        // Invierto vector
        for (int i = vAux.length - 1; i >= 0; i--) {
            vAux[vAux.length - 1 - i] = v[i];
        }
        
        // Comparo original vs invertido posición a posición
        for (int i = 0; i < v.length; i++) {
            if(v[i] != vAux[i]) return false;
        }
        
        return true;
    }
    
    public static int sumaDiagonalPrincipal(int[][] mat){
        int suma = 0;
        
        for (int i = 0; i < mat.length; i++) {
            suma += mat[i][i];
        }
        
        return suma;
    }
    
    public static int sumaDiagonalInversa(int[][] mat){
        int suma = 0;
        
        for (int i = 0; i < mat.length; i++) {
            suma += mat[i][mat.length - 1 - i];
        }
        
        return suma;
    }

    public static int cantColsAscendentes(int[][] mat){
        int cantColumnas = 0;
        
        for (int col = 0; col < mat[0].length; col++) {
            
            boolean colEsAsc = true;
            
            for (int fila = 0; fila < mat.length - 1; fila++) {
                if(mat[fila][col] > mat[fila + 1][col]){
                    colEsAsc = false;
                    break;
                }
            }
            
            if(colEsAsc){
                cantColumnas++;
            }
        }
        
        return cantColumnas;
    }

    public static boolean existenDosColsQueSumanLoMismo(int[][] mat){
        int[] sumaDeColumnas = new int[mat[0].length];
        
        for (int col = 0; col < mat[0].length; col++) {
            
            int sumaCol = 0;
            
            for (int fila = 0; fila < mat.length; fila++) {
                sumaCol += mat[fila][col];
            }
            
            sumaDeColumnas[col] = sumaCol;
        }
        
        for (int i = 0; i < sumaDeColumnas.length; i++) {
            for (int j = i + 1; j < sumaDeColumnas.length; j++) {
                if(sumaDeColumnas[i] == sumaDeColumnas[j]){
                    return true;
                }
            }
        }
        
        return false;
    }

}
