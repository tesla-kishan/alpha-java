import java.util.*;
public class functionc {
    public static int printhelloworld(){
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return 3;
        }
        public static int calculatesum(int num1 , int num2){    //parameters or formal parameters 
            
            int sum = num1+num2;
            System.out.println("sum is : " + sum );
            return sum;
        }

        public static void main(String args[]){

            printhelloworld();
            Scanner sc = new Scanner (System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum =  calculatesum(a,b);    //arguments or actual parameters
    }
    
    
}
