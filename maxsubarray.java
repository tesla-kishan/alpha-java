public class maxsubarray {
    public static void maxsubarraysum(int numbers[]){
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE; 
        for (int i=0 ; i<numbers.length ; i++ ){
            int start = i ;
            for (int j=i ; j<numbers.length ; j++){
                int end = j;
                currentsum = 0; 
                for (int k=start ;k<=end ; k++ ){
                    //System.out.print(numbers[k]+" ");
                    currentsum+= numbers[k];
                }
                System.out.println(currentsum);
                if(maxsum<currentsum){
                    maxsum=currentsum;
                }

            }
        }
        System.out.print("max sum= "+ maxsum);
    }
    public static void main(String args[]){
        int numbers [] = {1,-2,6,-1,3};
        maxsubarraysum(numbers);

    }
    
}
