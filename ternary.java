import java.util.*;
public class ternary {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter number a = ");
        int number = sc.nextInt();
        //ternary operator
        String type = number%2==0 ? "even" : "odd";
        System.out.println(type);


    }
    
}
