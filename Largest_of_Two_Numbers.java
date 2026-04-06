import java.util.*;

public class Largest_of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        System.out.println("enter another number:");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a is larger");
        } else {
            System.out.println("b is larger");
        }
    }
}
