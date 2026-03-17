public class question6 {
    public static void main(String[] args) {
        int arr[] = {10, 15, 20, 25};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] * arr[i] > 500) {
                System.out.println(arr[i]);
            }
        }
    }
}