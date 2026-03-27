package practico4;

public class Practico4 {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, 
                       {4, 5, 6}, 
                       {7, 8, 9}};
        
        int[][] mat2 = {{1, 2, 3}, 
                       {4, 5, 6}, 
                       {7, 8, 9},
                       {10, 11, 12}};
        
        //mostrarMatriz(mat);
        //mostrardiagonalV2(mat);
        //System.out.println("Máximo: " + maximoMatriz(mat));
        //mostrarColumna(mat, 1);
        //mostrarFila(mat, 1);
        //mostrarFilasImpares(mat2);
        System.out.println("buscarElementoEnMatriz: " + buscarElementoEnMatriz(mat2, 22));
    }
    
    public static void mostrarMatriz(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void mostrardiagonalV1(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
    
    public static void mostrardiagonalV2(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i]);
        }
    }
    
    public static int maximoMatriz(int[][] mat){
        int max = mat[0][0];
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] > max){
                    max = mat[i][j];
                }
            }
        }
        
        return max;
    }

    public static void mostrarColumna(int[][] mat, int columna){
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][columna]);
        }
    }
    
    public static void mostrarFila(int[][] mat, int fila){
        for (int j = 0; j < mat[fila].length; j++) {
            System.out.print(mat[fila][j] + " ");
        }
    }
    
    public static void mostrarFilasImpares(int[][] mat){
        for (int i = 1; i < mat.length; i+=2) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static boolean buscarElementoEnMatriz(int[][] mat, int elemento){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == elemento) return true;
            }
        }
        
        return false;
    }

    
}