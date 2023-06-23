import java.util.*;
public class Onetonuser {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter no.= ");
        int n = sc.nextInt();
        int b = 1;
        while(b<=n){
            System.out.print(b+" ");
            b++;
        }
    }
    
}
