import java.util.*;
import java.util.stream.*;

public class StringLength10 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream");

        List<Integer> lengths = list.stream()
                                   .map(s -> s.length())
                                   .collect(Collectors.toList());

        System.out.println(lengths);
    }
}