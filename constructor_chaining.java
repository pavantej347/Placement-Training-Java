import java.util.*;

public class constructor_chaining {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        ar.add(11);
        ar.add("india");
        ar.add(true);
        ar.add(5.54f);
        System.out.println(ar);
        System.out.println(ar.size());
        ar.remove(3);
        System.out.println(ar);
        System.out.println(ar.size());

    }
}
