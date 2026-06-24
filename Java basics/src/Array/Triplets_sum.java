package Array;

public class Triplets_sum {
    static void main(String[] args) {
        int [] arr ={1,4,5,6,3,5};
        int target = 10;
        int count=0;
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j= i+1; j<n; j++){
                for(int z=j+1; z<n; z++){
                    if(arr[i]+arr[j]+arr[z]==target){
                        count=count+1;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
