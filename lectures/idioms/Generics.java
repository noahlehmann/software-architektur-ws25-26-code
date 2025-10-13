package idioms;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args){
        try {
            noGenerics();
        } catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        generics();
    }

    private static void noGenerics(){
        List list = new ArrayList();
        list.add("a");
        list.add(123);

        String s = (String) list.get(0);
        System.out.println(s);
        String i = (String) list.get(1); // java.lang.ClassCastException
        System.out.println(i);
    }

    private static void generics(){
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        // list.add(123); compiler error

        String a = (String) list.get(0);
        System.out.println(a);
        String b = (String)  list.get(1);
        System.out.println(b);
    }
}