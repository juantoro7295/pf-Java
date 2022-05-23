package programacion.funcional;

import java.util.Arrays;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1,2,3,4,5,6,7,8,9,10,10);
        myList.stream()
                .map(elemt -> elemt*10)
                .forEach(System.out::println);
    }
}
