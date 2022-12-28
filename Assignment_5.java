import java.util.Arrays;

public class Assignment_5 {
    public static int getRandomSize(){

        return (int)(Math.random()*20+1);
    }
    public static int [] [] generateMatrix(int n){
        int [][] Matrix = new int[n][n];

        for (int row=0;row<Matrix.length;row++){
            for (int column=0;column<Matrix[row].length;column++){
                Matrix[row][column]= getRandomSize();
            }
        }
        return Matrix;
    }
    public static void printMatrix(int [][] matrix){
        for (int row=0;row<matrix.length;row++){
            for (int column=0;column<matrix[row].length;column++){
                if (matrix[row][column]<10){
                    System.out.print(matrix[row][column]+"  ");
                }
                else {
                    System.out.print(matrix[row][column] + " ");
                }
            }
            System.out.println();
        }
    }
    public static int computeSum(int[][] matrix){
        int sumofleftdiagonal =0;

        for (int i=0;i< matrix.length;i++){
            sumofleftdiagonal+=matrix[i][i];

        }
        int sumofrightdiagonal=0;
        int k= matrix.length-1;
        for (int i=0;i< matrix.length;i++){
            sumofrightdiagonal+= matrix[i][k];
            k--;

        }
        return sumofleftdiagonal+sumofrightdiagonal;
    }
    public static void main(String[] args) {

        int [][] matrix= generateMatrix((int)(Math.random()*10+1));
        System.out.println("Matrix:");
        printMatrix(matrix);
        System.out.println("sum of diagonals = "+computeSum(matrix));

    }
}
