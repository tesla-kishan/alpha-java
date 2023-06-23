public class reverse {
    public static void main(String srgs[]){
        int number = 9876501;
        while(number>0){
            int lastdigit = number%10;
            System.out.print(lastdigit);
            number = number /10 ;
        }
    }
    
}
