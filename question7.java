public class question7 {
    public static void main(String[] args) {
        String emails[] = {"shivam@gmail.com", "test.com", "user@yahoo", "ok@site.in"};

        for(int i = 0; i < emails.length; i++) {
            if(emails[i].contains("@") && emails[i].contains(".")) {
                System.out.println(emails[i]);
            }
        }
    }
}