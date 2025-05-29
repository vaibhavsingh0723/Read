public class diagonal_sum {

    public static void sum(int arr[][]){

        int sum = 0;
        int add = 0;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                if (i == j) {
                    sum += arr[i][j];
                }
                if (i+j == arr.length-1) {
                    add += arr[i][j];
                }
            }
        }
        System.out.println(sum);
        System.out.println(add);
        // for(int i = 0; i< arr.length; i++){
        //     for(int j = 0; j<arr[0].length; j++){
        //         if (i+j == arr.length-1) {
        //             add += arr[i][j];
        //         }
        //     }
        // }
        // System.out.println(add);
    }


    public static void main(String[] args) {
        int arr[][] ={
            {1, 2, 3}, {4, 5, 6}, {8, 8, 10}
        };

        sum(arr);
    }
}
