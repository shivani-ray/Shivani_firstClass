package Array;

public class LastOcc {
    static void main (String[] args) {
        int [] arr ={5,3,5,2,5,4,5};
        int Last_occ = -1;
        int x =1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                Last_occ=i;
            }
        }
        System.out.println(Last_occ);




    }
}
