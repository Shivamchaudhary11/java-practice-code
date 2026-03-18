import java.util.*;
import java.util.stream.*;

public class MultiplyList8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        List<Integer> newList = list.stream()
                                   .map(x -> x * 2)
                                   .collect(Collectors.toList());

        System.out.println(newList);
    }
}