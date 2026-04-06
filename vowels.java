public class vowels {
    public static void main(String[] args) {
        String st = "pavan";
        int vowel = 0;
        int consonent = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            } else {
                consonent++;
            }
        }
        System.out.println(vowel);
        System.out.println(consonent);

    }
}
