package programacion.funcional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorted {

    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10,-1);
        myList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
