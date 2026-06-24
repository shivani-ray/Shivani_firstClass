package Array;

import java.util.Arrays;

public class search_element {

    static void main(String[] args) {
        int [] arr= {1,2,4,5,6};
        int x=4;
        int ans =1;
        for( int i=0 ; i<arr.length;i++)
        {
            if(arr[i]==x){
                ans=i;
                System.out.println("found" + x + "at index"+ans);


                break;

            }




        }
    }
}
