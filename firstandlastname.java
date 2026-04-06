import java.util.*;

public class firstandlastname {
    public static void main(String[] args) {/*
                                             * String st = "pavan tej";
                                             * String[] arr = st.split(" ");
                                             * System.out.println(Arrays.toString(arr));
                                             */
        String st = "pavan tej reddy";
        int idx = st.indexOf(" ");

        System.out.println(st.substring(0, idx));
        System.out.println(st.substring(idx + 1));
    }
}
