public class pairsrray {
    public static void printpairs(int numbers[]){
        int tp = 0;
        for(int i=0; i<numbers.length ; i++){
            int current = numbers[i]; // 1,2,3,4,5,6,7,8,9,10,11,12
            for (int j=i+1 ; j<numbers.length  ;j++){
                System.out.print("(" + current + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();

        }
        System.out.print("total pairs "+tp);
    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,12};
        printpairs(numbers);
    }
    
}
