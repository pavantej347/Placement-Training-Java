import java.util.*;

public class swap_of_2_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num a =");
        int a = sc.nextInt();
        System.out.println("enter num b =");
        int b = sc.nextInt();
        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
