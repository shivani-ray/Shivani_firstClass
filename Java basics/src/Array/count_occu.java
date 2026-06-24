package Array;

public class count_occu {
    static void main(String[] args) {
        int [] arr = {2,1,3,2,5,4,2};
        int x =2;

        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(arr[i]==x){
                count=count+1;
            }
        }
        System.out.println(count);





    }

}
