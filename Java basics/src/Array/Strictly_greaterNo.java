package Array;

public class Strictly_greaterNo {
    static void main(String[] args) {
        int [] arr={5,3,5,2,8,1,0,5,6,5,2};
        int x =2;
        int count = 0;
        for(int i =0; i<arr.length; i++){
            if(x>arr[i]){
                count+=1;

            }
        }
        System.out.println(count);

    }
}
