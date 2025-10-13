package idioms;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        noAutoboxing();
        autoboxing();
    }

    private static void noAutoboxing() {
        List ints = new ArrayList();
        ints.add(new Integer(5));
        ints.add(new Integer(10));
        Integer first = (Integer) ints.get(0);
        int primitive = first.intValue();
        System.out.println(primitive);
    }

    private static void autoboxing() {
        List<Integer> ints = new ArrayList<>();
        ints.add(5);
        ints.add(10);
        int primitive = ints.getFirst();
        System.out.println(primitive);
    }
}