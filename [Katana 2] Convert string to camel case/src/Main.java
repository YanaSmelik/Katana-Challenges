public class Main {

    public static void main(String[] args) {

    }

    static String toCamelCase(String s) {
        StringBuilder s2 = new StringBuilder(s);
        while (s.contains("-")) {
            int letter = s.indexOf("-");
            s2.setCharAt(letter + 1, Character.toUpperCase(s.charAt(letter + 1)));
            s2.deleteCharAt(letter);
            s = s2.toString();
        }

        while (s.contains("_")) {
            int letter = s.indexOf("_");
            s2.setCharAt(letter + 1, Character.toUpperCase(s.charAt(letter + 1)));
            s2.deleteCharAt(letter);
            s = s2.toString();
        }
        return s2.toString();
    }
}
