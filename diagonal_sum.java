// wap to print the sum of diagonal matrix of a matrix
import java.util.Scanner;

public class diagonal_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the rows");
        int r = sc.nextInt();
        System.out.println(" enter the column");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println(" enter matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<r && i<c ;i++){
            sum+=matrix[i][i];
        }
        System.out.println("the sum of diagonal matrix is: "+ sum);
    }
    
}
