import java.util.*;
public class arrayinput {
    public static void main(String args[]){
        int marks []= new int[80];
        Scanner sc = new Scanner(System.in);
         marks[0] = sc.nextInt();
         marks[1] = sc.nextInt();
         marks[2] = sc.nextInt();

         System.out.println("phy marks= "+marks[0]);
         System.out.println("chem marks= "+marks[1]);
         System.out.println("maths marks= "+marks[2]);


      //   marks[2] = marks[2]+3;
        // System.out.println("maths updated marks= "+marks[2]);

         int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage+ "%");
        System.out.println("length of array= "+ marks.length);

    }
    
}
