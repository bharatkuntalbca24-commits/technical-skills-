// given an integer A of size n in one second you can increase the value of 1 elemnt by 1. find the min time in second to make all the elemnts of the array equal

// Observation : To minimize the time, make all element equl to the max. element in the array.

//  Pseudocode :
// 1. find the max element in array.
// 2. For every element calculate how much it needs to be increase to reach the max.
// 3. Sum all those differences.

import java.lang.reflect.Array;
import java.util.Scanner;

public class min_time {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc . nextInt();
        int [] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        // Array.sort(arr);
        int max=arr[n-1];
        int time=0;

        for (int i =0;i<n;i++){
            time+=max-arr[i];
        }
        System.out.println(time);

    }
}
