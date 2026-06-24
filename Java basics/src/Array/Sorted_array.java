package Array;

import java.util.Arrays;

public class Sorted_array {
    static void main(String[] args) {
        int [] arr ={2,4,5,10,11,6,8};
        boolean check = true;
        for(int i =1; i < arr.length ; i++){
            if(arr[i]<arr[i-1]){
                check=false;
                break;

            }
        }


        System.out.println(check);
    }
}
