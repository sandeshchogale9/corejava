package incubation.oops;

public class CharacterEncoding {
    public static void main(String[] args) {
        String input = "aabbbcc";
        String output = encodeString(input);
        System.out.println(output); // Output: a2b3c2
    }

    public static String encodeString(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                result.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        return result.toString();
    }
}

