// wap to print the matrix elements.
import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the rows");
        int r = sc.nextInt();
        System.out.println(" enter coulumn");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println(" enter matrix");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println(" matrix is");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(matrix[i][j]+" ");
            }
        }

    }
    
}
