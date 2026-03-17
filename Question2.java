public class Question2 {
    public static void main(String[] args) {
        String names[] = {"shivam", "Aman", "Riya", "Karan", "Sita","Naman"};

        for(int i = 0; i < names.length; i++) {
            if(names[i].endsWith("n")) {
                System.out.println(names[i]);
            }
        }
    }
}