public class question1 {
    public static void main(String[] args) {
        int[] arr = {3, 10, 15, 18, 20, 21};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}