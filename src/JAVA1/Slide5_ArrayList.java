package JAVA1;

import java.util.ArrayList;

public class Slide5_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Viet");
        a.add("Yen");
        System.out.println(a);

        // get
        String s = a.get(1);
        System.out.println(s);
        a.add(0,"Hoa");
        System.out.println(a);

        // remove
        a.remove("Hoa");
        System.out.println(a);
    }
}
