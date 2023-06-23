import java.util.*;
public class sumOF1stNnatutal {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter n ");
        int n = sc.nextInt();
        int sum =0;
        int i = 1;
        while (i<=n){
            sum+=i;
            i++;
            
        }
        System.out.println("sum is "+sum);
    }
    
}
