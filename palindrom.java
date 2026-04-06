public class palindrom {
    public static void main(String[] args) {
        // String st1 = "pavap";
        // String st2 = "";
        // for (int i = st1.length() - 1; i >= 0; i--) {
        // char ch = st1.charAt(i);
        // st2 = st2 + ch;
        // }
        // if (st1.equals(st2)) {
        // System.out.println("palindrom");
        // } else {
        // System.out.println("not");
        // }
        String st = "pavan";
        int leftpointer = 0;
        int rightpointer = st.length() - 1;
        boolean ispalindrom = true;
        while (leftpointer < rightpointer) {
            if (leftpointer == rightpointer) {
                leftpointer++;
                rightpointer--;
            } else {
                ispalindrom = false;
                break;
            }
        }
        if (ispalindrom) {
            System.out.println("palindrom");
        } else {
            System.out.println("not");
        }

    }
}
