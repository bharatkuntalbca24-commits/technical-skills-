import java.util.Scanner;

public class upperdiagonalSum {
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
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                if(j>i){
                    sum+=matrix[i][j];
                }
            }
        }
        System.out.println(" sum of upperdiagonal:"+ sum);

    }
    
}
