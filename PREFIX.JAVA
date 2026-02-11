public class PREFIX{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
         
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] pf = new int[n];

        pf[0]=arr[0];
        for(int i =1;i<n;i++){
            pf[i]=pf[i-1]+arr[i];
        
        }
        int count=0;
        for(int i=0;i<n;i++){
            int leftSum,int rightSum;
        }
        if(i==0){
            leftSum=0;
        }
        else{
            leftSum=pf[i-1]
        }
        rightSum=pf[n-1]-pf[i];
        if(leftSum== rightSum){
            count++;
        }
        System.out.println(count);
    }
}