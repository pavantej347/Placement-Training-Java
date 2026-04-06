public class substring {
    public static void main(String[] args) {
        String st = "Arun";
        for (int i = 0; i < st.length(); i++) {
            System.out.println(st.substring(0, i + 1));
        }
    }
}
