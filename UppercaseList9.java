import java.util.*;
import java.util.stream.*;

public class UppercaseList9{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("python","java", "stream");

        List<String> newList = list.stream()
                                  .map(s -> s.toUpperCase())
                                  .collect(Collectors.toList());

        System.out.println(newList);
    }
}