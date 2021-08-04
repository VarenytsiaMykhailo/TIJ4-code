public class MyClass {

    public String m(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
                result.append(str.charAt(i));
            } else {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

}
