import java.util.ArrayList;
import java.util.Scanner;

public class grapg1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the vertex count");
        int v=sc.nextInt();
        System.out.println("enter edges count");
        int E=sc.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<=)
    

        for(int i=1;i<=E;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            list.get(s).add(d);
            list.get(d).add(s);
            System.out.println("___________");
        }
        System.out.println("______________");
        int indx=0;
        for(ArrayList<Integer>li:list)
        {
            System.out.println(indx+"   ");
        }
    }
}
