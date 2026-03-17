public class question4 {
    public static void main(String[] args) {
        String arr[] = {"apple", "dog", "cat", "elephant"};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].contains("e")) {
                System.out.println(arr[i]);
            }
        }
    }
}