public class binarysearch {
    public static int binarysearch(int numbers[], int key){
        int start=0 , end = numbers.length-1;
        while (start<=end){
            int mid = (start+end)/2;

            //comparison
            if (numbers[mid]==key){ //found
                return mid;

            }
            if (numbers[mid]<key){    //right
              start = mid+1;  
            } else{
                end = mid-1; //left
            }


        }
        return -1;

    }
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,10,11,56,34,24};
        int key = 10;
        System.out.println("index for key is " + binarysearch(numbers,key) );

    }
    
}
