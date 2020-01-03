
public class Main {

	public static void main(String[] args) {

		System.out.println(capitalFirstLetter(null));

	}

	public static String capitalFirstLetter(String phrase) {
		if (null == phrase || phrase.isEmpty()) {
			return null;
		}
		char[] chars = phrase.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (i == 0 || chars[i - 1] == ' ') {
				chars[i] = Character.toUpperCase(chars[i]);
			}
		}
		return String.copyValueOf(chars);
	}
}