package arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[10]; // Un bloque de 10 espacios con un entero en cada uno de ellos
        a[0] = 11; // [11,x,x,x,x,x,x,x,x,x]
        a[1] = 7; // [11,7,x,x,x,x,x,x,x,x]
        // A los arreglos no se les puede cambiar el tamaño

        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 2;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
