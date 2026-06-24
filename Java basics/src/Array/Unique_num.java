package Array;

public class Unique_num {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2,5,6, 3, 1};
        int n = arr.length;


        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }

        }
        int ans=-1;
        for (int i=0; i<n; i++) {
            if (arr[i] > 0) {
//                ans=arr[i];
                System.out.println(arr[i]+ "  ");

            }
        }
//        System.out.println(ans);
    }
}
