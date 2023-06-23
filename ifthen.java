import java.util.*;
public class ifthen {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:a ");
        int a = sc.nextInt();
        System.out.print("Enter a number:b ");
        int b = sc.nextInt();
        System.out.print("Enter a number:c");
        int c = sc.nextInt();
        if ((a>=b) && (a>=c)){
            System.out.println("largest is a = " +a);
        }
        else if (b>=c){
        System.out.println("largest is b = " + b);}
        
        else {
        System.out.println("largest is c = " + c);
        }
        


       
    }
    
}
